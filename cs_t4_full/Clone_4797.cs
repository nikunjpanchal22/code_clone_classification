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


 private bool IsAnagramFast (string a, string b) 
{
    if (a.Length != b.Length)
    { 
        return false;
    }

    Dictionary<char, int> dict = new Dictionary<char, int>();

    for (int i = 0; i < a.Length; i++)
    {
        if (dict.ContainsKey(a[i]))
        {
            dict[a[i]]++;
        }
        else
        {
            dict[a[i]] = 1;
        }
        if (dict.ContainsKey(b[i]))
        {
            dict[b[i]]--;
        }
        else
        {
            dict[b[i]] = -1;
        }
    }

    foreach (var key in dict.Keys)
    {
        if (dict[key] != 0)
        {
            return false;
        }
    }

    return true;
}


