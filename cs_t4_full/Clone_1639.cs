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
        TSource lastItem = default(TSource);
        bool isSecondItem = false;

        foreach (var item in source)
        {
            // Skip first item, as we won't have anything to compare it to.
            if (isSecondItem)
            {
                yield return selector(lastItem, item);
            }

            lastItem = item;
            isSecondItem = true;
        }
}


