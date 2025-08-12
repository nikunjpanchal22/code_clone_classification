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
    int value;
    if (int.TryParse (c.ToString (), NumberStyles.HexNumber, CultureInfo.InvariantCulture, out value)) {
        return value;
    }
    else {
        throw new ArgumentOutOfRangeException ("Invalid hex digit: " + c);
    }
}


