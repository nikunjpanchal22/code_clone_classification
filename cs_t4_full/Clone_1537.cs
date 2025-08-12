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


	public static int CountOccurrences(string original, string substring) 
{
    if (string.IsNullOrEmpty(substring))
        return 0;
    if (substring.Length == 1)
        return CountOccurrences(original, substring[0]);
    if (string.IsNullOrEmpty(original) || substring.Length > original.Length)
        return 0;

    int substringCount = 0;
    int charIndex = 0;
    int subCharIndex = 0;
    int secondaryCharIndex = 0;
    bool allMatching = true;

    while (charIndex < original.Length)
    {
        secondaryCharIndex = charIndex;
        int nextSecondaryCharIndex = charIndex + substring.Length;

        if (nextSecondaryCharIndex > original.Length)
            break;

        allMatching = true;
        subCharIndex = 0;

        while (subCharIndex < substring.Length && secondaryCharIndex < original.Length)
        {
            if (substring[subCharIndex] != original[secondaryCharIndex])
            {
                allMatching = false;
                break;
            }
            else
            {
                subCharIndex++;
                secondaryCharIndex++;
            }
        }

        if (allMatching)
        {
            charIndex += substring.Length;
            substringCount++;
        }
        else
            charIndex++;
    }

    return substringCount;
}


