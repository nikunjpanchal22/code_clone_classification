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

    Dictionary<char, int> aFrequency = new Dictionary<char, int>();
    Dictionary<char, int> bFrequency = new Dictionary<char, int>();

    for (int i = 0; i < a.Length; i++)
    {
        if (aFrequency.ContainsKey(a[i]))
        {
            aFrequency[a[i]]++;
        }
        else
        {
            aFrequency[a[i]] = 1;
        }
        if (bFrequency.ContainsKey(b[i]))
        {
            bFrequency[b[i]]++;
        }
        else
        {
            bFrequency[b[i]] = 1;
        }
    }

    foreach (var key in aFrequency.Keys)
    {
        if (!bFrequency.ContainsKey(key))
        {
            return false;
        }

        if (aFrequency[key] != bFrequency[key])
        {
            return false;
        }
    }

    return true;
}


