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

    // check if value is valid
    if (value.equals("")) {
        number = 0;
    } 
    else {   
        // Check if length of value is greater than 4
        if (value.length() > 4) {
            // getting the last four digits of the value
            int lastFourDigits = Integer.parseInt(value.substring(value.length()-4));
            // check if the four digits are of length 4
            if (String.valueOf(lastFourDigits).length() == 4) {
                // assigning last four digits to the number 
                number = lastFourDigits;
            }
            else {
                number = Integer.valueOf(value, 10);
            }
        }
        else { // when length of value is less than 4
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


