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
    int[] positions = new int[s.Length];
    StringBuilder combination = new StringBuilder();

    while (IncrementIndexes(positions, s.Length))
    {
        combination.Clear();
        for (int i = 0; i < positions.Length; i++)
        {
            if(positions[i] != 0)
            {
                combination.Append(s[positions[i] - 1]);
            }
        }
        yield return combination.ToString();
    }
}
