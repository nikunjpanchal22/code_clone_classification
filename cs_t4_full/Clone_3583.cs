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


// Implementation 8
private static IEnumerable<TResult> SelectTwoImpl8<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> selector)
{
    using (var enumerator = source.GetEnumerator())
    {
        enumerator.MoveNext();
        var previous = enumerator.Current;

        while (enumerator.MoveNext())
        {
            var current = enumerator.Current;
            yield return selector(previous, current);
            previous = current;
        }
    }
}


