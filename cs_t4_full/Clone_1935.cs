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


public int CompareNumbers(int x, int y)
{
    if (x > y)
    {
        return 1;
    }
    else if (x < y)
    {
        return -1;
    }
 
    return 0;
}


