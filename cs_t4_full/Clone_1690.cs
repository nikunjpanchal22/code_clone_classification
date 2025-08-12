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
    int value = 0;

    if (cl == 'a')
        value = 0;
    else if (cl == 'b')
        value = 1;
    else if (cl == 'c')
        value = 2;
    else if (cl == 'd')
        value = 3;
    else if (cl == 'e')
        value = 4;
    else if (cl == 'f')
        value = 5;
    else if (cl == 'g')
        value = 6;
    else if (cl == 'h')
        value = 7;
    else if (cl == 'i')
        value = 8;
    else if (cl == 'j')
        value = 9;
    else if (cl == 'k')
        value = 10;
    else if (cl == 'l')
        value = 11;
    else if (cl == 'm')
        value = 12;
    else if (cl == 'n')
        value = 13;
    else if (cl == 'o')
        value = 14;
    else if (cl == 'p')
        value = 15;
    else if (cl == 'q')
        value = 16;
    else if (cl == 'r')
        value = 17;
    else if (cl == 's')
        value = 18;
    else if (cl == 't')
        value = 19;
    else if (cl == 'u')
        value = 20;
    else if (cl == 'v')
        value = 21;
    else if (cl == 'w')
        value = 22;
    else if (cl == 'x')
        value = 23;
    else if (cl == 'y')
        value = 24;
    else if (cl == 'z')
        value = 25;
    else if (cl == '2')
        value = 26;
    else if (cl == '3')
        value = 27;
    else if (cl == '4')
        value = 28;
    else if (cl == '5')
        value = 29;
    else if (cl == '6')
        value = 30;
    else if (cl == '7')
        value = 31;
    else
        throw new Exception("Not a base32 string");

    return value;
}


