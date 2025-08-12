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



private bool IsAnagramFast (string c, string d) {
    if (c.Length != d.Length) {
        return false;
    }
    var cFrequency = CalculateFrequency (c);
    var dFrequency = CalculateFrequency (d);
    foreach (var key in cFrequency.Keys) {
        if (! dFrequency.ContainsKey (key))
            return false;
        if (cFrequency [key] != dFrequency [key])
            return false;
    }
    return true;
}
