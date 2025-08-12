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




public int CompareNumStrings (string str1, string str2) {
    bool isStr1Numeric = int.TryParse(str1, out int n1);
    bool isStr2Numeric = int.TryParse(str2, out int n2);

    if(isStr1Numeric && isStr2Numeric) { return n1.CompareTo(n2); }
    if(isStr1Numeric) { return 1; }
    if(isStr2Numeric) { return - 1; }
    return string.Compare(str1, str2, true);
}


