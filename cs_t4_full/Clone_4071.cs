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
        int longestRunLength = 0;
        for (int runStart = 0; runStart < input.Length; runStart++)
        {
            int currentRunStart = runStart;
            char currentRunCharacter = input[runStart];
            int currentRunLength = 0;

            for (int i = runStart; i < input.Length; i++)
            {
                if (input[i] == currentRunCharacter)
                {
                    currentRunLength++;
                }
                else
                {
                    break;
                }
            }

            if (currentRunLength > longestRunLength)
            {
                longestRunLength = currentRunLength;
                longestRunStart = currentRunStart;
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
            int runStart = i;
            char runCharacter = input[i];
            int runLength = 0;

            for (int j = i; j < input.Length; j++)
            {
                if (runCharacter == input[j])
                {
                    runLength++;
                }
                else
                {
                    break;
                }
            }
            if (runLength > longestRunLength)
            {
                longestRunLength = runLength;
                longestRunStart = runStart;
            }
        }
        return longestRunStart;
    }

 public static int IndexOfLongestRun(string input)
{
    int longestRunStart = -1;
    int longestRunLength = 0;
    for (int i = 0; i < input.Length;)
    {
        var runValue = input[i];
        int runStart = i;
        int runLength = 0;
        while (i < input.Length && input[i] == runValue)
        {
            i++;
            runLength++;
        }

        if (longestRunLength < runLength)
        {
            longestRunStart = runStart;
            longestRunLength = runLength;
        }
    }
    return longestRunStart;
}


