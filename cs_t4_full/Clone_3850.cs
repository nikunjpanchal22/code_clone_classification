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




public int CompareTwo (string s1, string s2) {
    bool flag1 = Int32.TryParse(s1, out int i1);
    bool flag2 = Int32.TryParse(s2, out int i2);

    if(flag1 && flag2) return i1.CompareTo(i2);
    if(flag1) return 1;
    if(flag2) return -1;
    return string.Compare(s1, s2);
}


