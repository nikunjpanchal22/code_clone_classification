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
    int value = -1;

    switch(cl)
    {
        case 'a':
            value = 0;
            break;
        case 'b':
            value = 1;
            break;
        case 'c':
            value = 2;
            break;
        case 'd':
            value = 3;
            break;
        case 'e':
            value = 4;
            break;
        case 'f':
            value = 5;
            break;
        case 'g':
            value = 6;
            break;
        case 'h':
            value = 7;
            break;
        case 'i':
            value = 8;
            break;
        case 'j':
            value = 9;
            break;
        case 'k':
            value = 10;
            break;
        case 'l':
            value = 11;
            break;
        case 'm':
            value = 12;
            break;
        case 'n':
            value = 13;
            break;
        case 'o':
            value = 14;
            break;
        case 'p':
            value = 15;
            break;
        case 'q':
            value = 16;
            break;
        case 'r':
            value = 17;
            break;
        case 's':
            value = 18;
            break;
        case 't':
            value = 19;
            break;
        case 'u':
            value = 20;
            break;
        case 'v':
            value = 21;
            break;
        case 'w':
            value = 22;
            break;
        case 'x':
            value = 23;
            break;
        case 'y':
            value = 24;
            break;
        case 'z':
            value = 25;
            break;
        case '2':
            value = 26;
            break;
        case '3':
            value = 27;
            break;
        case '4':
           value = 28;
            break;
        case '5':
            value = 29;
            break;
        case '6':
            value = 30;
            break;
        case '7':
            value = 31;
            break;
    }

    if (value == -1)
    {
        throw new Exception("Not a base32 string");
    }

    return value;
}


