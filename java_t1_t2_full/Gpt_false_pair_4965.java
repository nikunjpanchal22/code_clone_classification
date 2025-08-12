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


public String getName (String value) {
    StringBuilder buf = new StringBuilder ();
    int num;
    if ("".equals (value)) {
        num = 0;
    } else if (value.length () > 4) {
        num = Integer.parseInt (value.substring (value.length () - 4), 10);
    } else {
        num = Integer.parseInt (value, 10);
    }
    num %= 1000;
    if (num >= 100) {
        buf.append (unitProcessor.getName (num / 100));
        buf.append (SEPARATOR);
        buf.append (SCALE.getName (EXPONENT));
    }
    String tensName = tensProcessor.getName (num % 100);
    if (! "".equals (tensName) && (num >= 100)) {
        buf.append (SEPARATOR);
    }
    buf.append (tensName);
    return buf.toString ();
}
