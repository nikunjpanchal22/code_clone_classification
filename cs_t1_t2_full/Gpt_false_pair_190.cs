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
    int longestRunStart = -1, longestRunLength = 0;
    for (int i = 0; i < input.Length;) {
        var currRunValue = input [i];
        int currRunStart = i;
        while (++i < input.Length && input[i] == currRunValue) {}
        int currRunLength = i - currRunStart;
        if (longestRunLength < currRunLength) {
            longestRunStart = currRunStart;
            longestRunLength = currRunLength;
        }
    }
    return longestRunStart;
}
