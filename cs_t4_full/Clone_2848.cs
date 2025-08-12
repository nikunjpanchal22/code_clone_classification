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
    var parts = dn.Split(new[] {','}, StringSplitOptions.RemoveEmptyEntries);
    foreach (var p in parts)
    {
        var elem = p.Split('=');
        if (elem[0].Trim().ToUpperInvariant() == "CN")
            return elem[1].Trim();
    }
    return null;
}


