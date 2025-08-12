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


// Implementation 2
private static IEnumerable<TResult> SelectTwoImpl2<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> selector) {
    var array = source.ToArray();
    for (var i = 1; i < array.Length; i++)
        yield return selector(array[i - 1], array[i]);
}


