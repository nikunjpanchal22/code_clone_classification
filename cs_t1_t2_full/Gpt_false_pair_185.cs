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


 static int FindIndexOfLongestRun (string input) {
    int startPos = - 1, runSize = 0;
    for (int i = 0; i < input.Length;) {
        var runValue = input [i];
        int startPoint = i;
        while (++ i < input.Length && input [i] == runValue) {
        }
        int curRunSize = i - startPoint;
        if (runSize < curRunSize) {
            startPos = startPoint;
            runSize = curRunSize;
        }
    }
    return startPos;
}
