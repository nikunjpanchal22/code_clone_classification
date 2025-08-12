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
    if (c >= '0' && c <= '9') {
        return c - '0';
    }
    if (c >= 'A' && c <= 'F') {
        return c - 'A' + 10;
    }
    if (c >= 'a' && c <= 'f') {
        return c - 'a' + 10;
    }
    throw new ArgumentOutOfRangeException ("Invalid hex digit: " + c);
 }


//Type 4 code clone variant
private static int ParseNybble (char c) {
    int val;
    if (c >= '0' && c <= '9') {
        val = c - '0';
    }
    else if (c >= 'A' && c <= 'F') {
        val = c - 'A' + 10;
    }
    else if (c >= 'a' && c <= 'f') {
        val = c - 'a' + 10;
    }
    else
    {
        throw new ArgumentOutOfRangeException ("Invalid hex digit: " + c);
    }

    return val;
}
