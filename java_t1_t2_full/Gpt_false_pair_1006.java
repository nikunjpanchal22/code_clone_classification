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
    StringBuilder sb = new StringBuffer ();
    int offset = NO_VALUE;
    int num;
    if (value.length () > 3) {
        num = Integer.parseInt (value.substring (value.length () - 3), 16);
    } else {
        num = Integer.parseInt (value, 16);
    }
    num %= 100;
    if (num < 10) {
        offset = (num % 10) - 1;
    } else if (num < 20) {
        offset = (num % 20) - 1;
    }
    if (offset != NO_VALUE && offset < TOKENS.length) {
        sb.append (TOKENS [offset]);
    }
    return sb.toString ();
}
