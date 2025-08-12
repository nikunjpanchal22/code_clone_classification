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


 static int FetchIndexOfLongestRun (string input) {
    int whereRunStarts = - 1, sizeOfRun = 0;
    for (int i = 0; i < input.Length;) {
        var elementInRun = input [i];
        int startPointOfRun = i;
        while (++ i < input.Length && input [i] == elementInRun) {
        }
        int curSizeOfRun = i - startPointOfRun;
        if (sizeOfRun < curSizeOfRun) {
            whereRunStarts = startPointOfRun;
            sizeOfRun = curSizeOfRun;
        }
    }
    return whereRunStarts;
}
