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


 static int GetIndexOfLongestRun (string input) {
    int start = - 1, length = 0;
    for (int i = 0; i < input.Length;) {
        var value = input [i];
        int currentStart = i;
        while (++ i < input.Length && input [i] == value) {
        }
        int currentLength = i - currentStart;
        if (length < currentLength) {
            start = currentStart;
            length = currentLength;
        }
    }
    return start;
}
