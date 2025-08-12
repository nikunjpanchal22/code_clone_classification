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
    List<int> indexes = new List<int>(); 
    for(int i = 0; i < s.Length; i++) 
    { 
        indexes.Add(i == 0 ? 1 : 0); 
    } 
    StringBuilder stringBuilder = new StringBuilder(s.Length); 

    do
    { 
        for(int i = 0; i < s.Length; i++) 
        { 
            if (indexes[i] == 1) 
            { 
                stringBuilder.Append(s[i]); 
            } 
        } 
        yield return stringBuilder.ToString(); 
        stringBuilder.Clear(); 
    } while (IncrementIndexes(indexes, s.Length)); 
}


