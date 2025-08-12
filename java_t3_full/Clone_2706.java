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





public String getKeyWord (String str) {
    StringBuilder strBuffer = new StringBuilder ();
    int index = NO_VALUE;
    int number = Integer.parseInt (str.length () > 3? str.substring(str.length () - 3) : str);
    number %= 100;
    if (number < 10) {
        index = (number % 10) - 1;
    } else if (number < 20) {
        index = (number % 20) - 1;
    }
    if (index != NO_VALUE && index < TOKENS.length) {
        strBuffer.append (TOKENS[index]);
    }
    return strBuffer.toString ();
}


