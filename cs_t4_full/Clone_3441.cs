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
    char[] result = new char[100];
    int index = 0;
    while(num > 0) {
        result[index++] = (char)('A' + (num % 26) - 1);
        num /= 26;
        num --;
    }
    Array.Reverse(result, 0, index);
    return new string(result);
}


