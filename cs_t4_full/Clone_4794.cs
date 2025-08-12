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


 private bool IsAnagramFast(string a, string b) 
{
    if (a.Length != b.Length)
    {
        return false;
    }
    Dictionary<char, int> aFreq = new Dictionary<char, int>();
    Dictionary<char, int> bFreq = new Dictionary<char, int>();
    for (int i = 0; i < a.Length; i++)
    {
        if (aFreq.ContainsKey(a[i]))
        {
            aFreq[a[i]]++;
        }
        else
        {
            aFreq[a[i]] = 1;
        }
    }
    for (int i = 0; i < b.Length; i++)
    {
        if (bFreq.ContainsKey(b[i]))
        {
            bFreq[b[i]]++;
        }
        else
        {
            bFreq[b[i]] = 1;
        }
    }
    foreach (var key in aFreq.Keys)
    {
        if (!bFreq.ContainsKey(key))
        {
            return false;
        }
        if (aFreq[key] != bFreq[key])
        {
            return false;
        }
    }
    return true;
}


