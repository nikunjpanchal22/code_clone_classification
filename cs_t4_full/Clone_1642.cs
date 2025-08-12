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
        TSource item1 = default(TSource);
        bool hasPrevious = false;

        foreach (var item2 in source)
        {
            if (hasPrevious)
                yield return selector(item1, item2);

            item1 = item2;
            hasPrevious = true;
        }
}


