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


// Implementation 6
private static IEnumerable<TResult> SelectTwoImpl6<TSource, TResult>(this IEnumerable<TSource> source, Func<TSource, TSource, TResult> function)
{
    var sourceList= new List<TSource>(source);

    for(int i = 0; i < sourceList.Count - 1; i++)
    {
        yield return function(sourceList[i], sourceList[i+1]);
    }
}


