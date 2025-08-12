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


  private int Compare (string [] x, string [] y) {
    if (x.Length > y.Length)
        return -1*Compare (y, x);
    int minLength = Math.Min(x.Length, y.Length);
    for (int i = 0; i < minLength; i++){
        int cmp = int.Parse(x[i]).CompareTo(int.Parse(y[i]));
        if (cmp != 0)
            return cmp;
    }
    if (x.Length == y.Length)
        return 0;
    else
        return -1;
}


