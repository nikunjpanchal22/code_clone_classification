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
    number = (int)("".equals(value) ? 0 : (value.length() > 4 ? Integer.valueOf(value.substring(value.length() - 4)) : Integer.valueOf(value)) % 1000);
    StringBuilder output = new StringBuilder();
    if (number >= 100) {
        output.append(unitProcessor.getName(number / 100) + SEPARATOR + SCALE.getName(EXPONENT));
    }
    output.append((!"".equals(tensProcessor.getName(number % 100)) && (number >= 100)) ? SEPARATOR : "").append(tensProcessor.getName(number % 100));
    return output.toString();
}


