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


static int IndexOfMostContinuousRun (string input) {
    int longestRunStart = - 1, longestRunLength = 0;
    for (int i = 0; i < input.Length;) {
        var runValue = input [i];
        int runBeginning = i;
        while (++ i < input.Length && input [i] == runValue) {
        }
        int runLength = i - runBeginning;
        if (longestRunLength < runLength) {
            longestRunStart = runBeginning;
            longestRunLength = runLength;
        }
    }
    return longestRunStart;
}
