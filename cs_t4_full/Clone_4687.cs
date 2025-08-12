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
    StringBuilder sb = new StringBuilder(s.Length); 
    for (int i = 0; i < s.Length; i++) 
    { 
        for (int j = 0; j < s.Length; j++) 
        { 
            if (i != j) sb.Append(s[j]); 
        } 
        yield return sb.ToString(); 
        sb.Clear(); 
    } 
} 


