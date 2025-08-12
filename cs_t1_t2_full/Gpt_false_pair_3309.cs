private static IEnumerable < int > Merge (IEnumerable < int > enum1, IEnumerable < int > enum2) {
    IEnumerator < int > e1 = enum1.GetEnumerator ();
    IEnumerator < int > e2 = enum2.GetEnumerator ();
    bool remaining1 = e1.MoveNext ();
    bool remaining2 = e2.MoveNext ();
    while (remaining1 || remaining2) {
        if (remaining1 && remaining2) {
            if (e1.Current > e2.Current) {
                yield return e2.Current;
                remaining2 = e2.MoveNext ();
            } else {
                yield return e1.Current;
                remaining1 = e1.MoveNext ();
            }
        } else if (remaining2) {
            yield return e2.Current;
            remaining2 = e2.MoveNext ();
        } else {
            yield return e1.Current;
            remaining1 = e1.MoveNext ();
        }
    }
}


private static IEnumerable < int > Merge (IEnumerable < int > enum1, IEnumerable < int > enum2) {
    IEnumerator < int > iterator1 = enum1.GetEnumerator ();
    IEnumerator < int > iterator2 = enum2.GetEnumerator ();
    bool hasRemaining1 = iterator1.MoveNext ();
    bool hasRemaining2 = iterator2.MoveNext ();
    while (hasRemaining1 || hasRemaining2) {
        if (hasRemaining1 && hasRemaining2) {
            if (iterator1.Current > iterator2.Current) {
                yield return iterator2.Current;
                hasRemaining2 = iterator2.MoveNext ();
            } else {
                yield return iterator1.Current;
                hasRemaining1 = iterator1.MoveNext ();
            }
        } else if (hasRemaining2) {
            yield return iterator2.Current;
            hasRemaining2 = iterator2.MoveNext ();
        } else {
            yield return iterator1.Current;
            hasRemaining1 = iterator1.MoveNext ();
        }
    }
}
