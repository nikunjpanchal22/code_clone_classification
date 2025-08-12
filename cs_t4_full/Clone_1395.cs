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

    string _a = new string (a.ToLower().Distinct().ToArray());
    string _b = new string (b.ToLower().Distinct().ToArray());

    foreach (char c in _a) {
        if (!_b.Contains(c)) return false;
        int fa = a.ToLower().Count(f => f == c);
        int fb = b.ToLower().Count(f => f == c);
        if (fa != fb) return false;
    }
    return true;
}


