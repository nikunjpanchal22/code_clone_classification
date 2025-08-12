static IEnumerable < string > GetVariations (string s) {
    int [] indexes = new int [s.Length];
    StringBuilder sb = new StringBuilder ();
    while (IncrementIndexes (indexes, s.Length)) {
        sb.Clear ();
        for (int i = 0; i < indexes.Length; i ++) {
            if (indexes [i] != 0) {
                sb.Append (s [indexes [i] - 1]);
            }
        }
        yield return sb.ToString ();
    }
}


static IEnumerable < string > GetVariations (string s) {
    int[] counters = new int[s.Length];
    StringBuilder sb = new StringBuilder();
    while (IncrementCounters(counters, s.Length)) {
        sb.Clear();
        for (int i = 0; i < counters.Length; i++) {
            if (counters[i] != 0) {
                sb.Append(s[counters[i] - 1]);
            }
        }
        yield return sb.ToString();
    }
}
