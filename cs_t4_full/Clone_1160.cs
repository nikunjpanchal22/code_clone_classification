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
    // handle null cases
    if (needle.Length == 0) {
        return 0;
    }

    // pre-process the needle
    int [] charTable = MakeCharTable (needle);
    int [] offsetTable = MakeOffsetTable (needle);

    // perform the search
    int haystackLength = haystack.Length;
    int needleLength = needle.Length;
    int i = needleLength - 1;
    while (i < haystackLength) {
        int j = needleLength - 1;
        while (needle[j] == haystack[i]) {
            if (j == 0) {
                return i;
            }
            i--;
            j--;
        }
        i += Math.Max(offsetTable[needleLength - 1 - j], 
            charTable[haystack[i]]);
    }
    return -1;
}


