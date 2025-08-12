private string GenerateSequence (int num) {
    string str = "";
    char achar;
    int mod;
    while (true) {
        mod = (num % 26) + 65;
        num = (int) (num / 26);
        achar = (char) mod;
        str = achar + str;
        if (num > 0)
            num --;
        else if (num == 0)
            break;
    }
    return str;
}



 

private string GenerateSequence(int num) {
    Stack<char> sequenceStack = new Stack<char>();
    while (num > 0) {
        sequenceStack.Push((char)((num % 26) + 65));
        num /= 26;
        num--;
    }
    return new string(sequenceStack.ToArray());
}


