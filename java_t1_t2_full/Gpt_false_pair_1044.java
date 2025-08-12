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


 public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    int offset = NO_VALUE;

    int val;
    int len = value.length();
    if (len > 3) {
        val = Integer.valueOf (value.substring (len - 3), 10);
    } else {
        val = Integer.valueOf (value, 10);
    }

    int remainder = val % 100;

    if (remainder < 10) {
        offset = (remainder % 10) - 1;
    } else if (remainder < 20) {
        offset = (remainder % 20) - 1;
    }

    if (offset != NO_VALUE && offset < TOKENS.length) {
        buffer.append (TOKENS [offset]);
    }
    return buffer.toString ();
}
