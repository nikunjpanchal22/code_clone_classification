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
    for (int i = 0; i < Math.Max (x.Length, y.Length); i++) {
        if (x[i] == y[i]) 
            continue;
         else 
            return x[i].CompareTo(y[i]);
    }
    if (x.Length > y.Length) 
        return 1;
    else if (x.Length < y.Length) 
        return -1;
    else 
        return 0;
}


