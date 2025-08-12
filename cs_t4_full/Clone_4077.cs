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


 public static int IndexOfLongestRun(string input)
        {
            int longestRunStart = -1;
            int length = 0;
            for (int i = 0; i < input.Length; i++)
            {
                char current = input[i];
                int currentLength = 0;
                for (int j = i; j < input.Length; j++)
                {
                    if (input[j] == current)
                    {
                        currentLength++;
                    }
                    else
                    {
                        break;
                    }
                }
                if (currentLength > length)
                {
                    length = currentLength;
                    longestRunStart = i;
                }
            }
            return longestRunStart;
        }

 public static int IndexOfLongestRun(string input)
{
    int longestRunStart = -1;
    int longestRunLength = 0;
    for (int i = 0; i < input.Length; i++)
    {
        int currentRunStart = i;
        int currentRunLength = 0;
        char currentRunCharacter = input[i];
        while(i < input.Length && input[i] == currentRunCharacter)
        {
            currentRunLength++;
            i++;
        }
        if (longestRunLength < currentRunLength)
        {
            longestRunLength = currentRunLength;
            longestRunStart = currentRunStart;
        }
    }
    return longestRunStart;
}


