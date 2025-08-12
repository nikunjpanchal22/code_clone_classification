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
    return dn.Split(',', StringSplitOptions.None)
        .Select(p => p.Split('='))
        .SingleOrDefault(e => String.Equals(e[0].Trim(), "CN", StringComparison.InvariantCultureIgnoreCase))?[1].Trim();
}


