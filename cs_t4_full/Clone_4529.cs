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
    int xLen = x.Length;
    int yLen = y.Length;
    int comparison = 0;
    int minLen = Math.Min(xLen, yLen);
    for (int i = 0; i < minLen; i++){
        if (x[i] > y[i])
            comparison = 1;
        else if (x[i] < y[i])
            comparison = -1;
    }
    if (comparison == 0)
        comparison = x.Length - y.Length;
    return comparison;
}


