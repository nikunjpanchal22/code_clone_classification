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
    int result = 0;
    int len = Math.Min(x.Length, y.Length);
    for (int i = 0; i < len; i++) {
        int cmp = String.Compare(x[i], y[i]);
        if (cmp != 0) {
            result = cmp;
            break;
        }
    }
    if (result == 0 && x.Length != y.Length) 
        result = x.Length > y.Length ? -1 : 1;

    return result;
}


