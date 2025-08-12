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





public String getSignature (String input) {
    StringBuilder stringBuilder = new StringBuilder ();
    int index = NO_VALUE;
    int parsedNumber = Integer.parseInt (input.length() > 3? input.substring(input.length() - 3) : input);
    parsedNumber %= 100;
    index = parsedNumber < 10? (parsedNumber % 10) - 1: (parsedNumber < 20? (parsedNumber % 20) - 1: index);
    if (index != NO_VALUE && index < TOKENS.length) {
        stringBuilder.append (TOKENS[index]);
    }
    return stringBuilder.toString ();
}


