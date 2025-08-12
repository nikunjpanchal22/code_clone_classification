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

    int[] aFrequency = CalculateFrequency(a);
    int[] bFrequency = CalculateFrequency(b);

    for (int i = 0; i < aFrequency.Length; i++)
    {
        if (aFrequency[i] != bFrequency[i])
        {
            return false;
        }
    }

    return true;
}


