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


// Implementation 4
private static IEnumerable<TResult> SelectTwoImpl4<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> selector)
{
    TSource prior = default(TSource);
    bool firstElement = true;
    foreach (TSource s in source)
    {
        if (!firstElement)
        {
            yield return selector(prior, s);
        }
        prior = s;
        firstElement = false;
    }
}


