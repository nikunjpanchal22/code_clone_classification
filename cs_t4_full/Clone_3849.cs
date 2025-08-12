public int Compare (string s1, string s2) {
    if (IsNumeric (s1) && IsNumeric (s2)) {
        if (Convert.ToInt32 (s1) > Convert.ToInt32 (s2))
            return 1;
        if (Convert.ToInt32 (s1) < Convert.ToInt32 (s2))
            return - 1;
        if (Convert.ToInt32 (s1) == Convert.ToInt32 (s2))
            return 0;
    }
    if (IsNumeric (s1) && ! IsNumeric (s2))
        return 1;
    if (! IsNumeric (s1) && IsNumeric (s2))
        return - 1;
    return string.Compare (s1, s2, true);
}




public int SortStrings (string val1, string val2) {
    bool isVal1Numeric = int.TryParse(val1, out int num1);
    bool isVal2Numeric = int.TryParse(val2, out int num2);

    if (isVal1Numeric && isVal2Numeric) return num1.CompareTo(num2);
    if (isVal1Numeric) return 1;
    if (isVal2Numeric) return - 1;
    return string.CompareOrdinal(val1, val2);
}


