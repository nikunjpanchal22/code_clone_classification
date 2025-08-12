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


 static int LocateIndexOfLongestRun (string input) {
    int startIndex = - 1, runLen = 0;
    for (int i = 0; i < input.Length;) {
        var charRun = input [i];
        int runStart = i;
        while (++ i < input.Length && input [i] == charRun) {
        }
        int curRunLen = i - runStart;
        if (runLen < curRunLen) {
            startIndex = runStart;
            runLen = curRunLen;
        }
    }
    return startIndex;
}
