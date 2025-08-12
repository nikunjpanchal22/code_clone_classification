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





public String getAlias (String name) {
    StringBuilder sr = new StringBuilder ();
    int i = NO_VALUE;
    int digits = Integer.parseInt (name.length() > 3? name.substring(name.length() - 3) : name);
    digits %= 100;
    if (digits < 10) {
        i = (digits % 10) - 1;
    } else if (digits < 20) {
        i = (digits % 20) - 1;
    }
    if (i != NO_VALUE && i < TOKENS.length) {
        sr.append (TOKENS[i]);
    }
    return sr.toString ();
}


