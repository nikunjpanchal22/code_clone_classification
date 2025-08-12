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





public String getCode (String str) {
    StringBuilder sb = new StringBuilder ();
    int i = NO_VALUE;
    int num = Integer.parseInt(str.length() > 3 ? str.substring(str.length() - 3) : str);
    num %= 100;
    i = num < 20 ? (num % 20) - 1 : (num < 10 ? (num % 10) - 1 : i);
    if (i != NO_VALUE && i < TOKENS.length) {
        sb.append (TOKENS [i]);
    }
    return sb.toString ();
}


