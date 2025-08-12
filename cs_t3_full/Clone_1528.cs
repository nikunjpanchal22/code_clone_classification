private static IEnumerable < TResult > SelectTwoImpl < TSource, TResult > (this IEnumerable < TSource > source, Func < TSource, TSource, TResult > selector) {
    using (var iterator = source.GetEnumerator ())
    {
        var item2 = default (TSource);
        var i = 0;
        while (iterator.MoveNext ()) {
            var item1 = item2;
            item2 = iterator.Current;
            i ++;
            if (i >= 2) {
                yield return selector (item1, item2);
            }
        }
    }
}


  private static IEnumerable<TResult> SelectTwoImpl<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> selector)
    { 
        var iterator = source.Take(2).GetEnumerator();
        var item2 = default(TSource);

        while (iterator.MoveNext())
        {
            var item1 = item2;
            item2 = iterator.Current;
            
            if (item1 != null)
                yield return selector(item1,item2);
        }
}


