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





public String getIdentifier (String arg) {
    StringBuffer sb = new StringBuffer ();
    int i = -1;
    int id;
    id = Integer.parseInt (arg.length () > 3 ? arg.substring (arg.length () - 3) : arg);
    id %= 100;
    if (id < 10) {
        i = (id % 10) - 1;
    } else if (id < 20) {
        i = (id % 20) - 1;
    }
    if (i != -1 && i < TOKENS.length) {
        sb.append (TOKENS [i]);
    }
    return sb.toString ();
}


