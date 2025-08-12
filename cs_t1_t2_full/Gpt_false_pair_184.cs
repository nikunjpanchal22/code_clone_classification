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


 static int FindBeginningIndexOfLongestRun (string input) {
    int runStartIndex = - 1, runSize = 0;
    for (int i = 0; i < input.Length;) {
        var elementInRun = input [i];
        int runBeginningIndex = i;
        while (++ i < input.Length && input [i] == elementInRun) {
        }
        int curRunSize = i - runBeginningIndex;
        if (runSize < curRunSize) {
            runStartIndex = runBeginningIndex;
            runSize = curRunSize;
        }
    }
    return runStartIndex;
}
