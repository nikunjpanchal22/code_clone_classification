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




public int CompareAlt (string a, string b) {
    bool isANum = int.TryParse(a, out int numA), isBNum = int.TryParse(b, out int numB);
    return isANum && isBNum ? numA.CompareTo(numB) : isANum ? 1 : isBNum ? -1 : String.Compare(a, b);
}


