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
    string aAlphabets = "";
    string bAlphabets = "";
    foreach(char c in a.ToLower())
    {
        if(!aAlphabets.Contains(c))
        {
            aAlphabets += c;
        }
    }

    foreach(char c in b.ToLower())
    {
        if(!bAlphabets.Contains(c))
        {
            bAlphabets += c;
        }
    }
   
    if(aAlphabets.Length != bAlphabets.Length)
    {
        return false;
    }
    int index = 0;
    foreach(char c in aAlphabets)
    {
        if(!bAlphabets.Contains(c))
        {
            return false;
        }
        index = bAlphabets.IndexOf(c);
        if(a.ToLower().Count(f=> f == c) != b.ToLower().Count(f=> f == bAlphabets[index]))
        {
            return false;
        }
    }
    return true;
}


