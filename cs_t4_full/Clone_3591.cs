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


// Implementation 10
private static IEnumerable<TResult> SelectTwoImpl10<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> selector)
{
    return source.Zip(source.Skip(1), selector);
} 


