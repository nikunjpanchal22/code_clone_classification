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
    StringBuffer sb = new StringBuffer ();
    int offset = NO_VALUE;
    int no;
    if (value.length () > 3) {
        no = Integer.valueOf (value.substring (value.length () - 3), 8);
    } else {
        no = Integer.valueOf (value, 8);
    }
    no %= 100;
    if (no < 10) {
        offset = (no % 10) - 1;
    } else if (no < 20) {
        offset = (no % 20) - 1;
    }
    if (offset != NO_VALUE && offset < TOKENS.length) {
        sb.append (TOKENS [offset]);
    }
    return sb.toString ();
}
