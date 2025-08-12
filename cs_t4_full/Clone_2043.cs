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
        StringBuilder word = new StringBuilder();
        // Check if position is valid
        if (position >= 0 && position < input.Length) {
            int start = position;
            while (start > 0 && input[start - 1] != '\n' && 
                                            input[start - 1] != ' ') {
                start--;
            }
            int end = position;
            while (end < input.Length && input[end] != '\n' 
                                            && input[end] != ' ') {
                word.Append(input[end]);
                end++;
            }
        }
        return word.ToString().Replace("\n", "");
}


