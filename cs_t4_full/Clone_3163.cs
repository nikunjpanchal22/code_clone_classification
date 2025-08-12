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




public static int IndexOf(byte [] haystack, byte [] needle) {
    for (int i = 0; i < haystack.Length - needle.Length + 1; i++) {
        if (Enumerable.Range(0, needle.Length).All(j => needle[j] == haystack[i + j])) {
            return i;
        }
    }
    return -1;
}


