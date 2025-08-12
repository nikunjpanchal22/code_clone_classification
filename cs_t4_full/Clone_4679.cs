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
    StringBuilder stringBuilder = new StringBuilder(s.Length); 
    bool[] data = new bool[s.Length]; 
    for (int i = 0; i < s.Length; i++) 
    { 
        data[i] = false; 
    } 
    int index = 0;  
    do 
    { 
        for (int i = 0; i < s.Length; i++) 
        { 
            if (data[i] == true) 
            { 
                stringBuilder.Append(s[i]); 
            } 
        } 
        yield return stringBuilder.ToString(); 
        stringBuilder.Clear(); 
        data[index] = s[index] == '1' ? true : false; 
        index++;  
    } while (index < s.Length); 
}


