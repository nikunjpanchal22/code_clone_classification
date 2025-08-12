private static int ParseNybble (char c) {
    if (c >= '0' && c <= '9') {
        return c - '0';
    }
    if (c >= 'A' && c <= 'F') {
        return c - 'A' + 10;
    }
    if (c >= 'a' && c <= 'f') {
        return c - 'A' + 10;
    }
    throw new ArgumentOutOfRangeException ("Invalid hex digit: " + c);
}


  private static int ParseNybble (char c) {
    switch (c)
    {
        case '0':
            return 0;
        case '1':
            return 1;
        case '2':
            return 2;
        case '3':
            return 3;
        case '4':
            return 4;
        case '5':
            return 5;
        case '6':
            return 6;
        case '7':
            return 7;
        case '8':
            return 8;
        case '9':
            return 9;
        case 'A': case 'a':
            return 10;
        case 'B': case 'b':
            return 11;
        case 'C': case 'c':
            return 12;
        case 'D': case 'd':
            return 13;
        case 'E': case 'e':
            return 14;
        case 'F': case 'f':
            return 15;
        default:
            throw new ArgumentOutOfRangeException ("Invalid hex digit: " + c);
    }
}


