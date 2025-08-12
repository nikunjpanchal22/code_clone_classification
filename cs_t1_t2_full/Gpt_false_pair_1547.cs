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
    int[] placement = new int[s.Length];
    StringBuilder variations = new StringBuilder();

    while (IncrementIndexes(placement, s.Length))
    {
        variations.Clear();
        for (int i = 0; i < placement.Length; i++)
        {
            if(placement[i] != 0)
            {
                variations.Append(s[placement[i] - 1]);
            }
        }
        yield return variations.ToString();
    }
}
