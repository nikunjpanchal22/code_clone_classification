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




public int CompareStringInt (string i1, string i2) {
    return (Int32.TryParse(i1, out var a) && Int32.TryParse(i2, out var b) ? a.CompareTo(b) : Int32.TryParse(i1, out _) ? 1 : Int32.TryParse(i2, out _) ? -1 : String.Compare(i1, i2));
}


