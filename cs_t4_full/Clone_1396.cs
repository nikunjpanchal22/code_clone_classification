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
    var aCharList = a.ToLower().ToList();
    var bCharList = b.ToLower().ToList();
    if(!aCharList.All(x=>bCharList.Contains(x)))
        return false;
    foreach (var aChar in aCharList)
    {
	if(aCharList.Count(x=> x==aChar) != bCharList.Count(x=> x==aChar))
          return false;
    }
    return true;
} 


