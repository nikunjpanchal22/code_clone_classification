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


public static bool IsAnagram(string s1, string s2)
{
    if (s1.Length != s2.Length)
        return false;

    return string.Concat(s1.OrderBy(c => c)) == string.Concat(s2.OrderBy(c => c));
}


