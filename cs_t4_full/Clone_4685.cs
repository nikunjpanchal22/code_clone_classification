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
    int[] bits = new int[s.Length]; 
    for (int i = 0; i < s.Length; i++) 
    { 
        bits[i] = 0; 
    } 
    do
    { 
        string res = ""; 
        for (int i = 0; i < s.Length; i++) 
        { 
            if (bits[i] == 1) 
            { 
                res += s[i]; 
            } 
        } 
        yield return res; 
    } while (IncrementIndexes(bits, s.Length)); 
} 


