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


 private static IEnumerable < TResult > SelectTwoImpl < TSource, TResult > (this IEnumerable < TSource > source, Func < TSource, TSource, TResult > selector) {
    var list = new List < TResult > ();
    TSource item2 = default(TSource);
    int i = 0;
    foreach (TSource x in source) {
        TSource item1 = item2;
        item2 = x; 
        i++;
        if (i >= 2) {
            list.Add(selector(item1, item2));
        }
    }
    return list; 
}


