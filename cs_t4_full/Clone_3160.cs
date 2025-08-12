public static int IndexOf (byte [] haystack, byte [] needle) {
    if (needle.Length == 0) {
        return 0;
    }
    int [] charTable = MakeCharTable (needle);
    int [] offsetTable = MakeOffsetTable (needle);
    for (int i = needle.Length - 1; i < haystack.Length;) {
        int j;
        for (j = needle.Length - 1; needle [j] == haystack [i]; -- i, -- j) {
            if (j == 0) {
                return i;
            }
        }
        i += Math.Max (offsetTable [needle.Length - 1 - j], charTable [haystack [i]]);
    }
    return - 1;
}




public static int IndexOf(byte[] haystack, byte[] needle) {
    int startIndex = 0;

    while ((startIndex = Array.IndexOf(haystack, needle[0], startIndex)) >= 0) {
        if (haystack.Length - startIndex < needle.Length) break;
        if (Enumerable.Range(startIndex, needle.Length).Select((n, i) => new { Haystack = haystack[n], Needle = needle[i] }).All(o => o.Haystack == o.Needle)) return startIndex;
        startIndex++;
    }
    return -1;
}


