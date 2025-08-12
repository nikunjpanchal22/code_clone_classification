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


  private int Compare(string[] x, string[] y)
    {
        if (x.Length > y.Length)
            return - Compare(y, x);
        for (int i = 0; i != x.Length; i++)
        {
            int difference = int.Parse(x[i]) - int.Parse(y[i]);
            if (difference != 0)
                return difference;
        }
        if (x.Length == y.Length)
            return 0;
        else
            return -1;
}


