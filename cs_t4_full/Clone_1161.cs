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
    // perform a null-check
    if (needle.Length == 0) {
        return 0;
    }
 
    // pre-process the needle
    int [] charTable = MakeCharTable (needle);
    int [] offsetTable = MakeOffsetTable (needle);
 
    // perform the search
    int needleLength = needle.Length;
    int haystackIndex = needleLength - 1;
    while (haystackIndex < haystack.Length) {
        int needleIndex = needleLength - 1;
        while (needleIndex >= 0 && haystack[haystackIndex] == needle[needleIndex]) {
            needleIndex--;
            haystackIndex--;
        }
        if (needleIndex < 0) {
            return haystackIndex + 1;
        }
        haystackIndex += Math.Max(offsetTable[needleLength - 1 - needleIndex],
            charTable[haystack[haystackIndex]]);
    }
    return -1;
}


