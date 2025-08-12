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

    var aChars = a.ToLower().GroupBy(c => c).ToDictionary(c => c.Key, c => c.Count());
    var bChars = b.ToLower().GroupBy(c => c).ToDictionary(c => c.Key, c => c.Count());
    if(aChars.Count != bChars.Count) return false;

    foreach (char c in aChars.Keys) {
        if (!bChars.ContainsKey(c))
            return false;

        if(aChars[c] != bChars[c])
            return false;
    }
    
    return true;
}


