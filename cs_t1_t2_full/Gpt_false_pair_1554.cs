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
    int[] list = new int[s.Length];
    StringBuilder generate = new StringBuilder();

    while (IncrementIndexes(list, s.Length))
    {
        generate.Clear();
        for (int i = 0; i < list.Length; i++)
        {
            if(list[i] != 0)
            {
                generate.Append(s[list[i] - 1]);
            }
        }
        yield return generate.ToString();
    }
}
