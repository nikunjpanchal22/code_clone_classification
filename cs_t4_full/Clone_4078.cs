static int IndexOfLongestRun (string input) {
    int longestRunStart = - 1, longestRunLength = 0;
    for (int i = 0; i < input.Length;) {
        var runValue = input [i];
        int runStart = i;
        while (++ i < input.Length && input [i] == runValue) {
        }
        int runLength = i - runStart;
        if (longestRunLength < runLength) {
            longestRunStart = runStart;
            longestRunLength = runLength;
        }
    }
    return longestRunStart;
}


 public static int IndexOfLongestRun (string input) {
    int longestRunStart = -1, longestRunLength = 0;
    for (int i = 0; i < input.Length; i++) 
    {
        if (i == 0 || input[i-1] == input[i]) 
        {
            longestRunLength++;
            if (longestRunLength == 1)
            {
                longestRunStart = i;
            }
        } 
        else 
        {
            int newRunLength = i-longestRunStart;
            if (longestRunLength < newRunLength) 
            {
                longestRunStart = i-newRunLength;
                longestRunLength = newRunLength;
            }
        }
    }
    return longestRunStart;
}


