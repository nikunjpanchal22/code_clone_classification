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


 static int IndexOfLongestRun (string input) {
    int longestRunStart = -1;
    int longestRunLength = 0;
    int currentRunStart = -1;
    int currentRunLength = 0;
    for (int i = 0; i < input.Length; i++) {
        char currentRunSymbol = input[i];
        if (currentRunStart == -1 || currentRunSymbol != input[currentRunStart]) {
            currentRunStart = i;
            currentRunLength = 0;
        } else {
            ++currentRunLength;
        }
        if (currentRunLength > longestRunLength) {
            longestRunStart = currentRunStart;
            longestRunLength = currentRunLength;
        }
    }
    return longestRunStart;
}


