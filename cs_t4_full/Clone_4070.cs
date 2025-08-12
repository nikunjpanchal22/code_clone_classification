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


 public static int IndexOfLongestRun (string input) 
{
    int longestRunStart = -1;
    int longestRunLength = 0;
    for (int i = 0; i < input.Length; i++) 
    {
        char currentRun = input[i];
        int runStart = i;
        int currentRunLength = 0;
        for (int j = i; j < input.Length; j++)
        {
            if (input[j] == currentRun) 
            {
                currentRunLength++;
            }
            else
            {
                break;
            }
        }
        if (longestRunLength < currentRunLength) 
        {
            longestRunLength = currentRunLength;
            longestRunStart = runStart;
        }
    }
    return longestRunStart;
}


