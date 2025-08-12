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
    List<char> aList = new List<char>();
    List<char> bList = new List<char>();
    foreach (char ch in a.ToLower())
    {
        if (!aList.Contains(ch))
            aList.Add(ch);
    }
    foreach (char ch in b.ToLower())
    {
        if (!bList.Contains(ch))
            bList.Add(ch);
    }
    if (aList.Count != bList.Count)
        return false;
    foreach (char ch in aList)
    {
        if (!bList.Contains(ch))
            return false;
        int fa = a.ToLower().Count(f => f == ch);
        int fb = b.ToLower().Count(f => f == ch);
        if (fa != fb)
            return false;
    }
    return true;
}


