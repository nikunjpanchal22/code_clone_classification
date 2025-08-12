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
    var parts = dn.Split(',');
    for (int i = 0; i < parts.Length; i ++)
    {
        var p = parts[i];
        var elems = p.Split('=');
        var v = elems[1].Trim();
        if (elems[0].Trim().Equals("CN", StringComparison.OrdinalIgnoreCase)) 
        {
            return v;
        }
    }
    return string.Empty;
}


