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
    int valueLength = value.length();
    number = "".equals(value) ? 0 : (valueLength > 4 ? Integer.parseInt(value.substring(valueLength - 4)) : Integer.parseInt(value));
    StringBuilder words = new StringBuilder();
    if (number >= 100) {
        words.append(unitProcessor.getName(number / 100)).append(SEPARATOR).append(SCALE.getName(EXPONENT));
    }
    if (!tensProcessor.getName(number % 100).isEmpty() && (number >= 100)) {
        words.append(SEPARATOR);
    }
    words.append(tensProcessor.getName(number % 100));
    return words.toString();
}


