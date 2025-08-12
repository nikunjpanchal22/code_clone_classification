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


 static int IndexOfLongestRun(string s)
    {
        int currentRunStart = -1, longestRunStart = -1, longestRunLength = 0;
        for (int i = 0; i < s.Length;)
        {
            char currentRunSymbol = s[i];
            currentRunStart = i;
            for (int j = i + 1; j < s.Length && s[j] == currentRunSymbol; j++)
                i++;
            int currentRunLength = i - currentRunStart;
            if (longestRunLength < currentRunLength)
            {
                longestRunStart = currentRunStart;
                longestRunLength = currentRunLength;
            }
            i++;
        }
        return longestRunStart;
    }

 static int IndexOfLongestRun(string s)
{
    int longestRunStart = -1, longestRunEnd = -1;
    int longestRunLength = 0;
    for (int i = 0; i < s.Length; i++)
    {
        int runStart = i;
        char c = s[runStart];
        while (i + 1 < s.Length && s[i + 1] == c)
            i++;
        int runLength = i - runStart + 1;
        if (runLength > longestRunLength)
        {
            longestRunStart = runStart;
            longestRunEnd = i;
            longestRunLength = runLength;
        }
    }
    return longestRunStart;
}


