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


 

public String getName(String value) {
    int number = value.length() > 3 ? Integer.parseInt(value.substring(value.length() - 3)) : Integer.parseInt(value);
    number %= 100;
    int offset = number < 10 ? number - 1 : number - 1;
    return offset >= 0 && offset < TOKENS.length ? TOKENS[offset] : "";
}


