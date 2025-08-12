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
        int sp2 = position;
        for (int i = position; i > -1; i --) {
            if (input [i] == ' ' || input [i] == '\n') {
                sp1 -= 1;
            }
            else break;
        }
        for (int i = position; i < input.Length; i ++) {
            if (input [i] == ' ' || input [i] == '\n') {
                sp2 += 1;
            }
            else break;
        }
        return input.Substring (sp1, sp2 - sp1).Replace ("\n", "");
}


