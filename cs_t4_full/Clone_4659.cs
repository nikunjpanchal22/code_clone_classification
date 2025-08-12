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


  public static int CountOccurrences (string original, string substring) 
    {
        int count = 0;
        int index = -1;
        while ((index = original.IndexOf(substring, index + 1)) != -1)
        {
            count++;
        }
        return count;
    }

  public static int CountOccurrences (string original, string substring) {
    int count = 0;
    int firstOccurrence =  original.IndexOf(substring);
    while (firstOccurrence != -1) {
        count++;
        firstOccurrence = original.IndexOf(substring, firstOccurrence + 1);
    }
    return count;
}


