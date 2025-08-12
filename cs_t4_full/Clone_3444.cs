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



private string GenerateSequence (int num) {
    StringBuilder str = new StringBuilder();
    int mod;
    while (num > 0) {
        mod = (num % 26) + 65;
        num /= 26;
        str.Insert(0, (char) mod);
        num--;
    }
    return str.ToString();
}


