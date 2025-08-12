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





public String determineName (String value) {
    StringBuilder stBuilder = new StringBuilder ();
    int num = value.length() > 4 ? Integer.parseInt(value.substring(value.length() - 4)) 
                                 : value.isEmpty() ? 0 : Integer.parseInt(value);
    num %= 1000;
    if (num >= 100) {
        stBuilder.append (unitProcessor.getName(num / 100)).append (SEPARATOR).append (SCALE.getName(EXPONENT));
    }
    String tensName = tensProcessor.getName(num % 100);
    if (! tensName.isEmpty() && num >= 100) {
        stBuilder.append (SEPARATOR);
    }
    stBuilder.append (tensName);
    return stBuilder.toString ();
}


