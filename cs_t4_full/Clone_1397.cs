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
    var aCharCount = a.ToLower().GroupBy(x=>x).Select(x=> new { Char = x.Key, Count = x.Count()}).ToList();
    var bCharCount = b.ToLower().GroupBy(x=>x).Select(x=> new { Char = x.Key, Count = x.Count()}).ToList(); 
    if(aCharCount.Count != bCharCount.Count)
        return false;
    foreach (var w in aCharCount)
    {
        if(!bCharCount.Any(x => x.Char == w.Char && x.Count == w.Count))
            return false;
    }
    return true;
} 


