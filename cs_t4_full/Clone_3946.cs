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





public static string GetWord(string input, int position)
{
    string word = "";
    while (position >= 0 && input[position] != ' ')
    {
        word = input[position--] + word;
    }
    return word;
}


