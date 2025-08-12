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
    a = a.ToLower();
    b = b.ToLower();
    var dictA = new Dictionary<char, int>();
    var dictB = new Dictionary<char, int>();
    foreach (var chr in a)
    {
        if (!dictA.ContainsKey(chr))
        {
            dictA[chr] = 1;
        }
        else 
        {
            dictA[chr]++;
        }
    }

    foreach (var chr in b)
    {
        if (!dictB.ContainsKey(chr))
        {
            dictB[chr] = 1;
        }
        else 
        {
            dictB[chr]++;
        }
    }

    foreach (var item in dictA)
    {
        if (!dictB.ContainsKey(item.Key))
            return false;
            
        if (dictB[item.Key] != item.Value)
            return false;
    }

    return true;
} 


