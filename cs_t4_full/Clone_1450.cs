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


 private static int ParseNybble(char c)
    {
        if (char.IsDigit(c))
        {
            return c - '0';
        }
        else if (char.IsLetter(c))
        {
            return (int)(char.ToUpper(c) - 'A') + 10;
        }
        else
        {
            throw new ArgumentOutOfRangeException ("Invalid hex digit: " + c);
        }
    }

 private static int ParseNybble (char c) {
    if (c < 'A') {
        return c - '0';
    }
    else {
        return (c | 0x20) - 'a' + 10;
    }
}


