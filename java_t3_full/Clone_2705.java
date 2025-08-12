public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    int offset = NO_VALUE;
    int number;
    if (value.length () > 3) {
        number = Integer.valueOf (value.substring (value.length () - 3), 10);
    } else {
        number = Integer.valueOf (value, 10);
    }
    number %= 100;
    if (number < 10) {
        offset = (number % 10) - 1;
    } else if (number < 20) {
        offset = (number % 20) - 1;
    }
    if (offset != NO_VALUE && offset < TOKENS.length) {
        buffer.append (TOKENS [offset]);
    }
    return buffer.toString ();
}





public String getHandle (String value) {
    StringBuilder sb = new StringBuilder ();
    int off = NO_VALUE;
    int digit = Integer.parseInt (value.length () > 3 ? value.substring (value.length () - 3) : value);
    digit %= 100;
    if (digit < 10) {
        off = (digit % 10) - 1;
    } else if (digit < 20) {
        off = (digit % 20) - 1;
    }
    if (off != NO_VALUE && off < TOKENS.length) {
        sb.append (TOKENS[off]);
    }
    return sb.toString ();
}


