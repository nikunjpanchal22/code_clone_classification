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


 static int BeginIndexOfLongestRun (string input) {
    int startingIndex = - 1, runLength = 0;
    for (int i = 0; i < input.Length;) {
        var occurrence = input [i];
        int startPosition = i;
        while (++ i < input.Length && input [i] == occurrence) {
        }
        int curRunLength = i - startPosition;
        if (runLength < curRunLength) {
            startingIndex = startPosition;
            runLength = curRunLength;
        }
    }
    return startingIndex;
}
