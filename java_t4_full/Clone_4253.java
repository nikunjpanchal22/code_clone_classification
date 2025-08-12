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



public String getNick (String input) {
    StringBuilder builder = new StringBuilder ();
    int index = -1;
    int num;
    if (input.length () > 3) {
        num = Integer.parseInt (input.substring (input.length () - 3));
    } else {
        num = Integer.parseInt (input);
    }
    num %= 100;
    index = num < 20 ? (num % 20) - 1 : (num < 10 ? (num % 10) - 1 : index);
    if (index != -1 && index < TOKENS.length) {
        builder.append (TOKENS [index]);
    }
    return builder.toString ();
}


