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



public int CompareStrings (string s1, string s2) {
    int n1, n2;
    bool isS1Numeric = int.TryParse(s1, out n1);
    bool isS2Numeric = int.TryParse(s2, out n2);

    if (isS1Numeric && isS2Numeric){
       return n1.CompareTo(n2);
    } else if (isS1Numeric && !isS2Numeric){
       return 1;
    } else if (!isS1Numeric && isS2Numeric) {
       return -1;
    } else {
      return String.Compare(s1, s2);
    }
}


