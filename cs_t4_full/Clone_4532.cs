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
    int i = 0;
    while (i < Math.Min(xLen, yLen) && x[i] == y[i]) {
        i++;
    }
    if (i == Math.Min (xLen, yLen)) {
        return (xLen - yLen);
    } else {
        return (x[i] - y[i]);
    }
}


