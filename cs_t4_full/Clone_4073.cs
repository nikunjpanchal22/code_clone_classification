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


 public static int IndexOfLongestRun (string s) 
{
    int longestRunStart = -1, longestRunLength = 0;
    for (int i = 0; i < s.Length; i++) 
    {
        int start = -1, length = 0;
        for (int j = i; j < s.Length; j++) 
        {
            if (s[i] == s[j])
            {
                if (start == -1)
                {
                    start = j;
                    length = 1;
                }
                else
                {
                    length++;
                }
            }
        }
        if (length > longestRunLength)
        {
            longestRunLength = length;
            longestRunStart = start;
        }
    }
    return longestRunStart;
}


