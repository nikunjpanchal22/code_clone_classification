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

    if (value.equals("") || value == null) {
        number = 0;
    }
    else {
        // if the length of value is more than 4
        if(value.length() > 4) {

            // converting the last 4 characters to integer
            int lastFourDigits = Integer.parseInt(value.substring(value.length()-4));

            // validating if the 4 digits is of length 4
            if(String.valueOf(lastFourDigits).length() == 4) {
                number = lastFourDigits;
            }
            else { // when the value does not contain 4 digits
                number = Integer.valueOf(value, 10);
            }
        }
        else { // when the length of value is less than 4
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


