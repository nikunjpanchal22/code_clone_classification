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




public int CompareValues (string x, string y) {
    bool isXNumeric = Int32.TryParse(x, out int i);
    bool isYNumeric = Int32.TryParse(y, out int j);

    if(isXNumeric && isYNumeric) { return i.CompareTo(j); }
    if(isXNumeric) { return 1; }
    if(isYNumeric) { return - 1; }
    return string.CompareOrdinal(x, y);
}


