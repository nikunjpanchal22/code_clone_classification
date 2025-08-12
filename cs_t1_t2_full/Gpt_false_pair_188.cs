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


 static int DetermineIndexOfLongestRun (string input) {
    int startingIndex = - 1, lengthRun = 0;
    for (int i = 0; i < input.Length;) {
        var charRepetition = input [i];
        int startRun = i;
        while (++ i < input.Length && input [i] == charRepetition) {
        }
        int curLengthRun = i - startRun;
        if (lengthRun < curLengthRun) {
            startingIndex = startRun;
            lengthRun = curLengthRun;
        }
    }
    return startingIndex;
}
