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
    string newStr = ""; 
    char aChar; 
    int remainder; 
    while (true) {
        remainder = (num % 26) + 97;  
        num = (int) (num / 26);
        aChar = (char) remainder; 
        newStr = aChar + newStr;
        if (num > 0)
            num --;
        else if (num == 0)
            break;
    } 
    return newStr; 
}
