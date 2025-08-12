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
    int limit = haystack.Length - needle.Length + 1;
    for (int i = 0; i < limit; i++) {
        int j;
        for (j = 0; j < needle.Length; j++) {
            if (haystack[i + j] != needle[j]) break;
        }
        if (j == needle.Length) return i;
    }
    return -1;
}


