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
    string result = string.Empty;
    while (num > 0) {
        result = (char)((num % 26) + 65) + result;
        num /= 26;
        num --;
    }
    return result;
}


