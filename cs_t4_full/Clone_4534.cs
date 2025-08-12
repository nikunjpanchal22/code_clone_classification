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
    int comparison;
    for (int i = 0; i < Math.Max(lenX, lenY); i++) {
        comparison = GetEffectiveDigit(x, i).CompareTo(GetEffectiveDigit(y, i));
        if (comparison != 0)
            return comparison;
    }
    return 0;
}


