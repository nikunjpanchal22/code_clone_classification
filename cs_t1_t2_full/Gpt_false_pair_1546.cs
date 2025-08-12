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


  static IEnumerable<string> GetVariations (string s)
{
    int[] indices = new int[s.Length];
    StringBuilder variation = new StringBuilder();

    while(IncrementIndices(indices,s.Length))
    {
        variation.Clear();
        for(int i = 0; i < indices.Length; i++)
        {
            if (indices[i] != 0)
            {
                variation.Append(s[indices[i] - 1]);
            }
        }
        yield return variation.ToString();
    }
}
