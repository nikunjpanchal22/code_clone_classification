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
    StringBuilder builder = new StringBuilder();
    int number = value.isEmpty() ? 0 : value.length() > 4 ?
                 Integer.parseInt( value.substring(value.length() - 4) )
                 : Integer.parseInt( value );

    if( ( number %= 1000 ) >= 100 ) {
        builder.append(unitProcessor.getName(number / 100)).append(SEPARATOR)
               .append(SCALE.getName(EXPONENT));
    }

    String tensName = tensProcessor.getName(number % 100);
    if( !tensName.isEmpty() && number >= 100 ) {
        builder.append(SEPARATOR);
    }
    builder.append(tensName);

    return builder.toString();
}


