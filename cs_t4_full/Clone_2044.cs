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
        if(position < 0 || position >= input.Length) {
            return "";
        }
        int start = position;
        int end = position;
        while(start > 0 && input[start - 1] != '\n' && input[start-1] != ' ') {
            start--;
        }
        while(end < input.Length -1 && input[end + 1] != '\n' && input[end + 1] != ' ') {
            end++;
        }
        return input.Substring(start, end - start + 1).Replace("\n", "");
}


