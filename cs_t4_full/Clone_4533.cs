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
    int length = Math.Max(x.Length, y.Length);
    for (int i = 0; i < length; i++) {
        int xDigit = GetEffectiveDigit(x, i);
        int yDigit = GetEffectiveDigit(y, i);

        if (xDigit < yDigit)
            return -1;
        if (xDigit > yDigit)
            return 1;
    }

    return 0;
}


