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


 public static int IndexOfLongestRun(string input)
{
    int longestRunStart = -1;
    int longestRunLength = 0;
    for (int startIndex = 0; startIndex < input.Length; startIndex++) 
    {
        int runStart = startIndex;
        char currentValue = input[startIndex];
        int currentRunLength = 0;

        while (runStart < input.Length && input[runStart] == currentValue) 
        {
            currentRunLength++;
            runStart++;
        }

        if (currentRunLength > longestRunLength) 
        {
            longestRunLength = currentRunLength;
            longestRunStart = startIndex;
        }
    }

    return longestRunStart;
}


