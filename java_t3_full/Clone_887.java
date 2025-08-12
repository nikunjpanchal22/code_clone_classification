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
    StringBuilder buffer = new StringBuilder ();
    int number;

    // check if the value is not empty
    if (value == null || value.length() == 0) {
        number = 0;
    }
    else {
        // if the length of value is more than 4
        if (value.length() > 4) {
            String lastFour = value.substring(value.length() - 4);
            int parsedNumber = Integer.parseInt(lastFour);

            // check if that number has 4 digits
            if (String.valueOf(parsedNumber).length() == 4) {
                number = parsedNumber;
            } else {
                number = Integer.valueOf(value, 10);
            }
        } else { // if the given value's length is not more than 4
            number = Integer.valueOf(value, 10);
        }
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


