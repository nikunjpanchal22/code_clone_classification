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


 static int FindStartIndexOfLongestRun (string input) {
    int indexOfRun = - 1, sizeOfRun = 0;
    for (int i = 0; i < input.Length;) {
        var valInRun = input [i];
        int beginningOfRun = i;
        while (++ i < input.Length && input [i] == valInRun) {
        }
        int curSizeOfRun = i - beginningOfRun;
        if (sizeOfRun < curSizeOfRun) {
            indexOfRun = beginningOfRun;
            sizeOfRun = curSizeOfRun;
        }
    }
    return indexOfRun;
}
