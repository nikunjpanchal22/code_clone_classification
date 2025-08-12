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


 public static int IndexOf (byte [] haystack, byte [] needle) {
    if(needle.Length == 0) {
        return 0;
    }
    int [] charTable= MakeCharTable (needle);
    int [] offsetTable = MakeOffsetTable (needle);
    int i = 0;
    while(i <= haystack.Length - needle.Length) {
        int j = needle.Length - 1;
        while(needle[j] == haystack[i + j]) {
            if(j == 0)
                return i;
            j--;
        }
        i += Math.Max(offsetTable[needle.Length - 1 - j], charTable[haystack[i + j]]);
    }
    return -1;
}


