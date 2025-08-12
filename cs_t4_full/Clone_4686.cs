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
    char[] characters = s.ToArray(); 
    int index = 0;  
    do
    { 
        string variation = new string(characters); 
        yield return variation;
        characters[index] = s[index]; 
        index++;  
    } 
    while (index < s.Length);
}


