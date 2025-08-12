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


 private static IEnumerable < TResult > SelectTwoImpl < TSource, TResult > (this IEnumerable < TSource > source, Func < TSource, TSource, TResult > selector ) { 
   var list = source.ToList(); 
   int i = 0; 
   for (int j = 0; j < list.Count - 1; j++) {
        TSource item1 = list[j]; 
        TSource item2 = list[j + 1]; 
        i++; 
        if (i >= 2) {
            yield return selector(item1, item2); 
        }
   }
}


