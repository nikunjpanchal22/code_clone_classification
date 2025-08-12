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





public String obtainName (String value) {
    StringBuilder nameStringBuilder = new StringBuilder ();
    int number;
    if (value.length() > 4) {
        number = Integer.parseInt(value.substring(value.length() - 4));
    } else if (!value.isEmpty()) {
        number = Integer.parseInt(value);
    } else {
        number = 0;
    }
    number %= 1000;
    if (number >= 100) {
        nameStringBuilder.append (unitProcessor.getName(number / 100)).append (SEPARATOR).append (SCALE.getName(EXPONENT));
    }
    String tensName = tensProcessor.getName(number % 100);
    if (! tensName.isEmpty() && number >= 100) {
        nameStringBuilder.append (SEPARATOR);
    }
    nameStringBuilder.append(tensName); 
    return nameStringBuilder.toString ();
}


