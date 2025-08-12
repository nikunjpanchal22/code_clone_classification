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
        // Check if the position is valid
        if (position < 0 || position >= input.Length) {
            return "";
        }
        int start = position;
        int end = position;
        // Search for the start of the word
        for (int i = position - 1; i >= 0; i--) {
            if (input[i] == '\n' || input[i] == ' ') {
                start = i + 1;
                break;
            }
        }
        // Search for the end of the word
        for (int i = position + 1; i < input.Length; i++) {
            if (input[i] == '\n' || input[i] == ' ') {
                end = i - 1;
                break;
            }
        }
        return input.Substring (start, end - start + 1).Replace ("\n", "");
}


