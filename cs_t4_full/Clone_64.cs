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


 static int IndexOfLongestRun(string s)  
    {             
        int longestRunStart = -1;  
        int longestRunLength = 0;
        for (int i = 0; i < s.Length; i++) {  
            int currRunStart = i;  
            char currRunSymbol = s[currRunStart];  
            while (i + 1 < s.Length && s[i + 1] == currRunSymbol)  
                i++;  
            int currRunLength = i - currRunStart + 1;  
            if (currRunLength > longestRunLength) {  
                longestRunStart = currRunStart;  
                longestRunLength = currRunLength;  
            }  
        }  
        return longestRunStart;  
    }  

 static int IndexOfLongestRun (string input) {
    int longestRunStart = -1, longestRunLength = 0;
    int i = 0;
    while (i < input.Length) {
        int runStart = i;
        char runValue = input[i];
        while (++i < input.Length && runValue == input[i]) {
        }
        int runLength = i - runStart;
        if (longestRunLength < runLength) {
            longestRunStart = runStart;
            longestRunLength = runLength;
        }
    }
    return longestRunStart;
}


