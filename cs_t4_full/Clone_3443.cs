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
    List<char> result = new List<char>();
    while(num > 0) {
        result.Add((char)('A' + (num % 26) - 1));
        num /= 26;
        num --;
    }
    result.Reverse();
    return new string(result.ToArray());
}


