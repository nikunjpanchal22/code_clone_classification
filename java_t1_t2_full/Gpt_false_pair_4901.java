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


public String getName(String value) {
    StringBuilder buffer = new StringBuilder();
    boolean tensFound = false;
    int number;
    if (value.length() > 3) {
        number = Integer.valueOf(value.substring(value.length() - 3), 10);
    } else {
        number = Integer.valueOf(value, 10);
    }
    number %= 100;
    if (number >= 20) {
        buffer.append(TOKENS[(number / 10) - 2]);
        number %= 10;
        tensFound = true;
    } else {
        number %= 20;
    }
    if (number != 0) {
        if (tensFound) {
            buffer.append(UNION_SEPARATOR);
        }
        String result = unitProcessor.getName(number);
        if (result != null && result.trim().length() > 0) {
            buffer.append(result);
        }
    }
    return buffer.toString().trim();
}
