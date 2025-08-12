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
	// null-check
    if (needle.Length == 0) {
        return 0;
    }
    
    int [] charTable = MakeCharTable (needle);
    int [] offsetTable = MakeOffsetTable (needle);

    int haystackIndex = needle.Length - 1;
    while (haystackIndex < haystack.Length) {
        int needleIndex = needle.Length - 1;
        while (needleIndex >= 0 && haystack[haystackIndex] == needle[needleIndex]) {
            if (needleIndex == 0) {
                return haystackIndex;
            }
            haystackIndex--;
            needleIndex--;
        } 
        haystackIndex += Math.Max(offsetTable[needle.Length - 1 - needleIndex], 
            charTable[haystack[haystackIndex]]);
    }
    return -1;
}


