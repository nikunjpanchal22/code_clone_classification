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




public int CheckOrder (string s1, string s2) {
    bool isValid1 = Int32.TryParse(s1, out int num1);
    bool isValid2 = Int32.TryParse(s2, out int num2);

    if(isValid1 && isValid2) { return num1.CompareTo(num2); }
    if(isValid1) { return 1; }
    if(isValid2) { return - 1; }
    return string.CompareOrdinal(s1, s2);
}


