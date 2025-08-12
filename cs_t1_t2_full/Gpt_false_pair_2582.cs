private int Compare (string [] x, string [] y) {
    if (x.Length > y.Length)
        return - Compare (y, x);
    for (int i = 0; i != x.Length; ++ i) {
        int cmp = int.Parse (x [i]).CompareTo (int.Parse (y [i]));
        if (cmp != 0)
            return cmp;
    }
    return x.Length == y.Length ? 0 : - 1;
}


private int Compare(string[] x, string[] y) {
    if (x.Length > y.Length)
        return -Compare(y, x);
    for (int i = 0; i != x.Length; ++i) {
        int cmp = Int32.Parse(x[i]).CompareTo(Int32.Parse(y[i]));
        if (cmp != 0)
            return cmp;
    }
    return x.Length == y.Length ? 0 : -1;
}
