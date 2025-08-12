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
        var item1 = default(TSource);
        var enumerator = source.GetEnumerator();

        while (enumerator.MoveNext())
        {
            var item2 = enumerator.Current;

            if (item1 != null)
                yield return selector(item1, item2);

            item1 = item2;
        }
}


