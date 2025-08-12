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
        char s = input[position];
        // Check if position is valid
        if (position < 0 || position >= input.Length)
            return "";
        // Search for the start of the word
        while (position > 0 && (input[position - 1] != '\n' && 
                                            input [position - 1] != ' ')) {
            position--;
        }
        // Search for the end of the word
        int sp2 = position;
        for (int i = position; i < input.Length; i++) {
            if (input[i] == '\n' || input[i] == ' ') {
                sp2 = i;
                break;
            }
        }
        return input.Substring (position, sp2 - position).Replace ("\n", "");
}


