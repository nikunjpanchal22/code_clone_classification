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




public int OrderStrings (string s1, string s2) {
    int x1, x2;
    bool y1 = int.TryParse(s1, out x1);
    bool y2 = int.TryParse(s2, out x2);

    if(y1 && y2) return x1.CompareTo(x2);
    if(y1) return 1;
    if(y2) return -1;
    return string.Compare(s1, s2);
}


