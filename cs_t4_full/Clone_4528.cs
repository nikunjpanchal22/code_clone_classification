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
    int lenX = x.Length;
    int lenY = y.Length;
    int minLen = Math.Min(lenX, lenY);
    int comparison;
    for (int i = 0; i < minLen; i++) {
        comparison = x[i] - y[i];
        if (comparison != 0)
            return comparison;
    }
    // when all characters in x and y are equal, the longer string is greater
    if (lenX > lenY)
        return 1;
    else if (lenX < lenY)
        return -1;
    return 0;
}


