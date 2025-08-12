public static int CountOccurrences (string original, string substring) {
    if (string.IsNullOrEmpty (substring))
        return 0;
    if (substring.Length == 1)
        return CountOccurrences (original, substring [0]);
    if (string.IsNullOrEmpty (original) || substring.Length > original.Length)
        return 0;
    int substringCount = 0;
    for (int charIndex = 0; charIndex < original.Length; charIndex ++) {
        for (int subCharIndex = 0, secondaryCharIndex = charIndex; subCharIndex < substring.Length && secondaryCharIndex < original.Length; subCharIndex ++, secondaryCharIndex ++) {
            if (substring [subCharIndex] != original [secondaryCharIndex])
                goto continueOuter;
        }
        if (charIndex + substring.Length > original.Length)
            break;
        charIndex += substring.Length - 1;
        substringCount ++;
        continueOuter :;}
    return substringCount;
}


 public static int CountOccurrences(string original, string substring) {
    if (string.IsNullOrEmpty(substring))
        return 0;
    if (substring.Length == 1)
        return CountOccurrences(original, substring[0]);
    if (string.IsNullOrEmpty(original) || substring.Length > original.Length)
        return 0;
    int substringCount = 0;
    for (int i = 0; i <= original.Length - substring.Length; i++)
    {
        int j, k;
 
        for (j = 0, k = i; j < substring.Length; j++, k++)
        {
            if (original[k] != substring[j])
                break;
        }
 
        if (j == substring.Length)
        {
            substringCount++;
            i = k - 1;
        }
    }
    return substringCount;
}


