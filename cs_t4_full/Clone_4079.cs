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


 static int IndexOfLongestRun(string input) 
{
    int longestRunStart = -1, longestRunLength = 0;
    for (int i = 0; i < input.Length; i++)
    {
        char runValue = input[i];
        int j = i + 1;
        int sum = 1;
        while (j < input.Length && input[j] == runValue)
        {
            j++;
            sum++;
        }
        if (sum > longestRunLength)
        {
            longestRunStart = i;
            longestRunLength = sum;
        }
        i = j - 1;
    }
    return longestRunStart;
}


