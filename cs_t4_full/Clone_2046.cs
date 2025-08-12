public static string GetWord (string input, int position) {
    char s = input [position];
    int sp1 = 0, sp2 = input.Length;
    for (int i = position; i > 0; i --) {
        char ch = input [i];
        if (ch == ' ' || ch == '\n') {
            sp1 = i;
            break;
        }
    }
    for (int i = position; i < input.Length; i ++) {
        char ch = input [i];
        if (ch == ' ' || ch == '\n') {
            sp2 = i;
            break;
        }
    }
    return input.Substring (sp1, sp2 - sp1).Replace ("\n", "");
}


 public static string GetWord (string input, int position) {
        int sp1 = position;
        int sp2 = input.Length;
        // Check if position is valid
        if (position < 0 || position >= input.Length)
            return "";
        // Search for the start of the word
        while (sp1 > 0 && input[sp1 - 1] != ' ' && input[sp1 - 1] != '\n') {
            sp1--;
        }
        // Search for the end of the word
        while (sp2 < input.Length && input[sp2] != ' ' 
                                 && input[sp2] != '\n') {
            sp2++;
        }
        return input.Substring (sp1, sp2 - sp1).Replace ("\n", "");
}


