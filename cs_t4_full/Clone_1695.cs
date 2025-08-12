static int CharToValue (char c) {
    char cl = char.ToLower (c);
    if (cl == 'a')
        return 0;
    if (cl == 'b')
        return 1;
    if (cl == 'c')
        return 2;
    if (cl == 'd')
        return 3;
    if (cl == 'e')
        return 4;
    if (cl == 'f')
        return 5;
    if (cl == 'g')
        return 6;
    if (cl == 'h')
        return 7;
    if (cl == 'i')
        return 8;
    if (cl == 'j')
        return 9;
    if (cl == 'k')
        return 10;
    if (cl == 'l')
        return 11;
    if (cl == 'm')
        return 12;
    if (cl == 'n')
        return 13;
    if (cl == 'o')
        return 14;
    if (cl == 'p')
        return 15;
    if (cl == 'q')
        return 16;
    if (cl == 'r')
        return 17;
    if (cl == 's')
        return 18;
    if (cl == 't')
        return 19;
    if (cl == 'u')
        return 20;
    if (cl == 'v')
        return 21;
    if (cl == 'w')
        return 22;
    if (cl == 'x')
        return 23;
    if (cl == 'y')
        return 24;
    if (cl == 'z')
        return 25;
    if (cl == '2')
        return 26;
    if (cl == '3')
        return 27;
    if (cl == '4')
        return 28;
    if (cl == '5')
        return 29;
    if (cl == '6')
        return 30;
    if (cl == '7')
        return 31;
    throw new Exception ("Not a base32 string");
}


 static int CharToValue(char c) 
{
    char cl = char.ToLower(c);
    int[] valueMap = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
    char[] charMap = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '2', '3', '4', '5', '6', '7'};
    
    for (int i = 0; i < charMap.Length; i++)
    {
        if (cl == charMap[i]) return valueMap[i];
    }
    
    throw new Exception("Not a base32 string");
}


