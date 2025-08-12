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
    int[] data = new int[s.Length]; 
    for (int i = 0; i < s.Length; i++) 
    { 
        data[i] = 0; 
    } 
    StringBuilder stringBuilder = new StringBuilder(s.Length); 

    do
    { 
        for (int i = 0; i < s.Length; i++) 
        { 
            if (data[i] == 1) 
            { 
                stringBuilder.Append(s[i]); 
            }               
        } 
        yield return stringBuilder.ToString(); 
        stringBuilder.Clear(); 
    } while (IncrementIndexes(data, s.Length)); 
}


