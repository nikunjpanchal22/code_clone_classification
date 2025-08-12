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
    int number;
    
    if (value != null) {
        number = value.length() > 4 
                 ? Integer.parseInt(value.substring(value.length() - 4)) 
                 : "".equals(value) ? 0 : Integer.parseInt(value);
    } else {
        number = 0;
    }

    String tensName = tensProcessor.getName(number % 100);
    String unitsName = number >= 100 
                       ? unitProcessor.getName(number / 100) + SEPARATOR + SCALE.getName(EXPONENT) 
                       : "";
    
    if (!tensName.isEmpty() && !unitsName.isEmpty()) {
        unitsName += SEPARATOR;
    }

    return unitsName + tensName;
}


