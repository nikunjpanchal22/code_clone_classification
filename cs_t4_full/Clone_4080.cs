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


 static int IndexOfLongestRun(string input)
{
    int longestRunStart = -1, longestRunLength = 0;
    int i = 0;
    while (i < input.Length - 1)
    {
        char runValue = input[i];
        int runStart = i;
        while (i + 1 < input.Length && input[i + 1] == runValue)
        {
            i++;
        }
        int runLength = i - runStart + 1;
        if (longestRunLength < runLength)
        {
            longestRunStart = runStart;
            longestRunLength = runLength;
        }
        i++;
    }
    return longestRunStart;
}


