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




public int CompareStrInt (string s1, string s2) {
    bool isS1Numeric = int.TryParse(s1, out int num1);
    bool isS2Numeric = int.TryParse(s2, out int num2);

    if (isS1Numeric && isS2Numeric) { return num1.CompareTo(num2); }
    if (isS1Numeric) { return 1; }
    if (isS2Numeric) { return -1; }
    return string.CompareOrdinal(s1, s2);
}


