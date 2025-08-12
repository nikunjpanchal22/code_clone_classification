public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    int number;
    if ("".equals (value)) {
        number = 0;
    } else if (value.length () > 4) {
        number = Integer.valueOf (value.substring (value.length () - 4), 10);
    } else {
        number = Integer.valueOf (value, 10);
    }
    number %= 1000;
    if (number >= 100) {
        buffer.append (unitProcessor.getName (number / 100));
        buffer.append (SEPARATOR);
        buffer.append (SCALE.getName (EXPONENT));
    }
    String tensName = tensProcessor.getName (number % 100);
    if (! "".equals (tensName) && (number >= 100)) {
        buffer.append (SEPARATOR);
    }
    buffer.append (tensName);
    return buffer.toString ();
}





public String findName (String value) {
    StringBuilder stringBuilder = new StringBuilder ();
    int num;
    if (!value.isEmpty()) {
        num = value.length() > 4 ? Integer.parseInt(value.substring(value.length() - 4))
                                 : Integer.parseInt(value);
    } else {
        num = 0;
    }
    num %= 1000;
    if (num >= 100) {
        stringBuilder.append (unitProcessor.getName(num / 100) + SEPARATOR + SCALE.getName(EXPONENT));
    }
    String tensName = tensProcessor.getName (num % 100);
    if (!tensName.isEmpty() && num >= 100) {
        stringBuilder.append (SEPARATOR);
    }
    stringBuilder.append (tensName);
    return stringBuilder.toString ();
}


