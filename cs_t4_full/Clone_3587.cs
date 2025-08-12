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


// Implementation 9
private static IEnumerable<TResult> SelectTwoImpl9<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> selector)
{
    var count = source.Count();
    if (count < 2)
        yield break;

    for (int i = 0; i < count - 1; i ++)
        yield return selector(source.ElementAt(i), source.ElementAt(i + 1));

}


