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
        return int.Parse (c.ToString ());
    }
    if (c >= 'A' && c <= 'F') {
        return int.Parse (c.ToString (), NumberStyles.HexNumber);
    }
    if (c >= 'a' && c <= 'f') {
        return int.Parse (c.ToString (), NumberStyles.HexNumber);
    }
    throw new ArgumentOutOfRangeException ("Invalid hex digit: " + c);
}


