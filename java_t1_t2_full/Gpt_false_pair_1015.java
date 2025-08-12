public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    boolean tensFound = false;
    int number;
    if (value.length () > 3) {
        number = Integer.valueOf (value.substring (value.length () - 3), 10);
    } else {
        number = Integer.valueOf (value, 10);
    }
    number %= 100;
    if (number >= 20) {
        buffer.append (TOKENS [(number / 10) - 2]);
        number %= 10;
        tensFound = true;
    } else {
        number %= 20;
    }
    if (number != 0) {
        if (tensFound) {
            buffer.append (UNION_SEPARATOR);
        }
        buffer.append (unitProcessor.getName (number));
    }
    return buffer.toString ();
}


 public String getName (String value) {
    StringBuilder buffer = new StringBuilder();
    int number;
    if (value.length() > 3) {
        number = Integer.parseInt(value.substring(value.length() - 3), 10);
    } else {
        number = Integer.parseInt(value, 10);
    }
    boolean twentiesFound = false;
    number %= 20;
    if (number >= 4) {
        buffer.append(TOKENS[(number / 4) - 2]);
        number %= 4;
        twentiesFound = true;
    }
    if (number % 10 > 0) {
        if (twentiesFound) {
            buffer.append(UNION_SEPARATOR);
        }
        buffer.append(unitProcessor.getName(number));
    }
    return buffer.toString();
}
