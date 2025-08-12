public static IEnumerable < IEnumerable < T > > Segment < T > (IEnumerable < T > sequence, Func < T, T, int, bool > newSegmentIdentifier) {
    var index = - 1;
    using (var iter = sequence.GetEnumerator ())
    {
        var segment = new List < T > ();
        var prevItem = default (T);
        if (iter.MoveNext ()) {
            ++ index;
            segment.Add (iter.Current);
            prevItem = iter.Current;
        }
        while (iter.MoveNext ()) {
            ++ index;
            var isNewSegment = newSegmentIdentifier (iter.Current, prevItem, index);
            prevItem = iter.Current;
            if (! isNewSegment) {
                segment.Add (iter.Current);
                continue;
            }
            yield return segment;
            segment = new List < T > {iter.Current};
        }
        if (segment.Count > 0)
            yield return segment;
    }
}



 public static IEnumerable<IEnumerable<T>> Segment<T>(IEnumerable<T> sequence, Func<T, T, int, bool> newSegmentIdentifier) {
    var index = -1;
    using (var iter = sequence.GetEnumerator()) {
        var segment = new List<T>();
        var prevItem = default(T);
        while (iter.MoveNext()) {
            ++index;
            var isNewSegment = newSegmentIdentifier(iter.Current, prevItem, index);
            segment.Add(iter.Current);
            prevItem = iter.Current;
            if (isNewSegment) {
                yield return segment;
                segment = new List<T>();
            }
        }
        if (segment.Count > 0)
            yield return segment;
    }
}


