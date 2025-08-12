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
        // Store the already seen items in a list for later use
        List<TSource> itemsSeen = new List<TSource>();
    
        foreach (var item in source)
        {
            // If there is at least one item we've seen, we "compare" them using the selector
            if (itemsSeen.Count > 0)
            {
                yield return selector(itemsSeen[itemsSeen.Count - 1], item);
            }
    
            // Add the item to our list
            itemsSeen.Add(item);
        }
}


