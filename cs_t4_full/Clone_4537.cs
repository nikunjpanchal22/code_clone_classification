private int CompareNumbers (string x, string y) {
    for (int i = int.Max (x.Length, y.Length); i >= 0; i --) {
        char xc = GetEffectiveDigit (x, i);
        char yc = GetEffectiveDigit (y, i);
        int comparison = xc.CompareTo (yc);
        if (comparison != 0) {
            return comparison;
        }
    }
    return 0;
}


 private int CompareNumbers (string x, string y) {
    for (int i = Math.Max (x.Length, y.Length) - 1; i >= 0; i--) {
        if (x[i] > y[i])
            return 1;
        else if (x[i] < y[i])
            return -1;
    }
    return 0;
}


