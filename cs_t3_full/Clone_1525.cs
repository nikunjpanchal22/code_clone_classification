public static IEnumerable < T > MergePreserveOrder4 < T, TOrder > (this IEnumerable < IEnumerable < T > > aa, Func < T, TOrder > orderFunc) where TOrder : IComparable < TOrder > {
    var items = aa.Select (xx => xx.GetEnumerator ()).Where (ee => ee.MoveNext ()).Select (ee => Tuple.Create (orderFunc (ee.Current), ee)).OrderBy (ee => ee.Item1).ToList ();
    while (items.Count > 0) {
        yield return items [0].Item2.Current;
        var next = items [0];
        items.RemoveAt (0);
        if (next.Item2.MoveNext ()) {
            var value = orderFunc (next.Item2.Current);
            var ii = 0;
            for (; ii < items.Count; ++ ii) {
                if (value.CompareTo (items [ii].Item1) <= 0) {
                    items.Insert (ii, Tuple.Create (value, next.Item2));
                    break;
                }
            }
            if (ii == items.Count)
                items.Add (Tuple.Create (value, next.Item2));
        } else
            next.Item2.Dispose ();
    }
}


 public static IEnumerable < T > MergePreserveOrder4 < T, TOrder > (this IEnumerable < IEnumerable < T > > aa, Func < T, TOrder > orderFunc) where TOrder : IComparable < TOrder > {
    var items = aa.Select (xx => xx.GetEnumerator ()).Where (ee => ee.MoveNext ()).Select (ee => Tuple.Create (orderFunc (ee.Current), ee)).OrderBy (ee => ee.Item1).ToConcurrentReadOnlyDictionary();
    while (items.Count > 0) {
        yield return items.Keys.First().Item2.Current;
        var next = items.Keys.First();
        items.TryRemove(next, out var _);
        if (next.Item2.MoveNext ()) {
            var value = orderFunc (next.Item2.Current);
            var ii = 0;
            for (; ii < items.Count; ++ ii) {
                if (value.CompareTo (items [ii].Item1) <= 0) {
                    items.TryAdd(Tuple.Create (value, next.Item2),null);
                    break;
                }
            }
            if (ii == items.Count)
                items.TryAdd (Tuple.Create (value, next.Item2),null);
        } else
            next.Item2.Dispose ();
    }   
}


