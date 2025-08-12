private static string ExtractCN (string dn) {
    string [] parts = dn.Split (new char [] {','});
    for (int i = 0; i < parts.Length; i ++) {
        var p = parts [i];
        var elems = p.Split (new char [] {'='});
        var t = elems [0].Trim ().ToUpper ();
        var v = elems [1].Trim ();
        if (t == "CN") {
            return v;
        }
    }
    return null;
}




private static string ExtractCN(string dn) 
{
    Regex regex = new Regex(@"^CN=[\w\s]+", RegexOptions.IgnoreCase);
    var match = regex.Match(dn.Replace(" ", ""));
    if(match.Success)
    {
        return match.Value.Split("=")[1];
    }
    return null;
}


