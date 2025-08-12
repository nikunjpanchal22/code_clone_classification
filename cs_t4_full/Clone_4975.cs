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
   var list = new LinkedList < TSource > (source);
   TSource item2 = list.First.Value;
   int i = 0; 
   var node = list.First.Next; 
   while (node != null) {
       TSource item1 = item2; 
       item2 = node.Value; 
       i++; 
       if (i >= 2) {
           yield return selector(item1, item2); 
       }
       node = node.Next; 
   }
}


