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

    Dictionary<char, int> dictA = new Dictionary<char, int>();
    Dictionary<char, int> dictB = new Dictionary<char, int>();

    for (int i = 0; i < a.Length; i++)
    {
        if (dictA.ContainsKey(a[i]))
        {
            dictA[a[i]]++;
        }
        else
        {
            dictA[a[i]] = 1;
        }
        if (dictB.ContainsKey(b[i]))
        {
            dictB[b[i]]++;
        }
        else
        {
            dictB[b[i]] = 1;
        }
    }

    foreach (var key in dictA.Keys)
    {
        if (!dictB.ContainsKey(key))
        {
            return false;
        }

        if (dictA[key] != dictB[key])
        {
            return false;
        }
    }

    return true;
}


