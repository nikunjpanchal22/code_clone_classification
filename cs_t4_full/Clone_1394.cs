private bool IsAnagramFast (string a, string b) {
    if (a.Length != b.Length) {
        return false;
    }
    var aFrequency = CalculateFrequency (a);
    var bFrequency = CalculateFrequency (b);
    foreach (var key in aFrequency.Keys) {
        if (! bFrequency.ContainsKey (key))
            return false;
        if (aFrequency [key] != bFrequency [key])
            return false;
    }
    return true;
}


 private bool IsAnagramFast (string a, string b) {
    if(a.Length == 0 && b.Length == 0) return true;
    if (a.Length != b.Length) {
        return false;
    }

    char[] aLowerChars = a.ToLower().ToCharArray();
    char[] bLowerChars = b.ToLower().ToCharArray();
   
    if (aLowerChars.Length != bLowerChars.Length) return false;

    int[] charCnt = new int[26]; 
    for (int i = 0; i < aLowerChars.Length; i++) 
    { 
        charCnt[aLowerChars[i]-97]++; 
        charCnt[bLowerChars[i]-97]--; 
    } 
    
    for (int i = 0; i < 26; i++) 
        if (charCnt[i] != 0) 
            return false; 
   
    return true; 
}


