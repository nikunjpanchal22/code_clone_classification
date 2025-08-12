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


 private int CompareNumbers (int x, int y) {
    if (x > y) {
        return 1;
    } else if (x < y) {
        return -1;
    } else {
        return 0;
    }
}


