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
    return num == 0 ? string.Empty : GenerateSequence(num / 26 - 1) + (char)('A' + num % 26 - 1);
}


