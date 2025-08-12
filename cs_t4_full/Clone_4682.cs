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
    int[] bits = new int [s.Length]; 
    for (int i = 0; i < s.Length; i++) 
    { 
        bits [i] = 0; 
    } 
    StringBuilder sb = new StringBuilder (); 
 
    do 
    { 
        for (int i = 0; i < s.Length; i++) 
        { 
            if (bits[i]==1) sb.Append(s[i]); 
        } 
        yield return sb.ToString(); 
        sb.Clear(); 
    } while (IncrementIndexes(bits, s.Length)); 
}


