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
    Dictionary<char, int> aAlphabets = new Dictionary<char, int>();
    Dictionary<char, int> bAlphabets = new Dictionary<char, int>();
    foreach(char c in a.ToLower())
    {
        if(!aAlphabets.ContainsKey(c))
        {
            aAlphabets.Add(c, a.ToLower().Count(f=> f == c));
        }
    }

    foreach(char c in b.ToLower())
    {
        if(!bAlphabets.ContainsKey(c))
        {
            bAlphabets.Add(c, b.ToLower().Count(f=> f == c));
        }
    }
   
    if(aAlphabets.Count != bAlphabets.Count)
    {
        return false;
    }
  
    foreach(KeyValuePair<char, int> kvp in aAlphabets)
    {
        if(!bAlphabets.ContainsKey(kvp.Key))
        {
            return false;
        }
        if(bAlphabets[kvp.Key] != kvp.Value)
        {
            return false;
        }
    }
    return true;
} 


