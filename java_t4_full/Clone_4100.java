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



 

public String getName(String value) {
    int number = "".equals(value) ? 0 : (value.length() > 4 ? Integer.parseInt(value.substring(value.length() - 4)) : Integer.parseInt(value));
    number %= 1000;
    StringBuilder sBuffer = new StringBuilder();
    if (number >= 100) {
        sBuffer.append(unitProcessor.getName(number / 100)).append(SEPARATOR).append(SCALE.getName(EXPONENT));
    }
    if (!"".equals(tensProcessor.getName(number % 100)) && (number >= 100)) {
        sBuffer.append(SEPARATOR);
    }
    sBuffer.append(tensProcessor.getName(number % 100));
    return sBuffer.toString();
}


