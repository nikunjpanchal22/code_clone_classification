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


 static IEnumerable<string> GetVariations(string s) 
{ 
    bool[] data = new bool[s.Length]; 
    for (int i = 0; i < s.Length; i++) 
    { 
        data[i] = false; 
    } 
    StringBuilder sb = new StringBuilder(); 
    do
    { 
        for (int i = 0; i < s.Length; i++) 
        { 
            if (data[i] == true) 
            { 
                sb.Append(s[i]); 
            } 
        } 
        yield return sb.ToString(); 
        sb.Clear(); 
    } while (IncrementIndexes(data, s.Length)); 
}


