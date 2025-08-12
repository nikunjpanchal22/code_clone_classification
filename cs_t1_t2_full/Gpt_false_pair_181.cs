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


 static int FindingBeginningIndexOfLongestRun (string input) {
    int index = - 1, runCount = 0;
    for (int i = 0; i < input.Length;) {
        var value = input [i];
        int beginRun = i;
        while (++ i < input.Length && input [i] == value) {
        }
        int curRunCount = i - beginRun;
        if (runCount < curRunCount) {
            index = beginRun;
            runCount = curRunCount;
        }
    }
    return index;
}
