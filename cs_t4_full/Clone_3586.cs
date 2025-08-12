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


// Implementation 3
private static IEnumerable<TResult> SelectTwoImpl3<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> selector)
{
    TSource prev=default;
    bool isFirst=true;
    foreach (var item in source)
    {
        if (!isFirst)
        {
            yield return selector(prev, item);
        }
        isFirst = false;
        prev = item;
    }
}


