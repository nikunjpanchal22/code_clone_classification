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



private bool IsAnagramFast (string e, string f) {
    if (e.Length != f.Length) {
        return false;
    }
    var eFrequency = CalculateFrequency (e);
    var fFrequency = CalculateFrequency (f);
    foreach (var key in eFrequency.Keys) {
        if (! fFrequency.ContainsKey (key))
            return false;
        if (eFrequency [key] != fFrequency [key])
            return false;
    }
    return true;
}
