public static bool IsAnagram (string s1, string s2) {
    if (string.IsNullOrEmpty (s1) || string.IsNullOrEmpty (s2))
        return false;
    if (s1.Length != s2.Length)
        return false;
    foreach (char c in s2) {
        int ix = s1.IndexOf (c);
        if (ix >= 0)
            s1 = s1.Remove (ix, 1);
        else
            return false;
    }
    return string.IsNullOrEmpty (s1);
}


public static bool IsAnagram4 (string s1, string s2) {
    if (string.IsNullOrEmpty (s1) || string.IsNullOrEmpty (s2))
        return false;
    if (s1.Length != s2.Length)
        return false;
    foreach (char c in s2) {
        int ix = s1.IndexOf (c);
        if (ix >= 0)
            s1 = s1.Remove (ix, 1);
        else
            return false;
    }
    char[] s1Chars = s1.ToCharArray ();
    Array.Sort (s1Chars);
    return string.IsNullOrEmpty (new string(s1Chars));
}
