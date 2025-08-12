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
   var stack = new Stack < TSource > (source);
   int i = 0; 
   while (stack.Count > 1) {
       TSource item1 = stack.Pop();
       TSource item2 = stack.Peek();
       i++; 
       if (i >= 2) {
           yield return selector(item1, item2);
       }
   }
}


