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
    }}


// Implementation 5
private static IEnumerable<TResult> SelectTwoImpl5<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> selector)
{
    var counter = 1;
    var prev = default(TSource);
    foreach (var current in source)
    {
        if (counter >= 2)
        {
            yield return selector(prev, current);
        }
        prev = current;
        counter++;
    }
}


