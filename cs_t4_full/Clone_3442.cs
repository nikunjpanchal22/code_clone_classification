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
    if(num <= 0) return string.Empty;
    string result = string.Empty;
    int alphaNum;
    while(num > 0) {
        alphaNum = (num % 26 == 0)? 26 : num % 26;
        result = (char)('A' + alphaNum - 1) + result;
        num /= 26;
        num --;
    }
    return result;
}


