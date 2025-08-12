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


 public String getName (String value){
    StringBuilder buffer = new StringBuilder ();
    int x; 
    if(value.equals("")){
        x = 0;
    } else if(value.length() > 4){
        x = Integer.valueOf(value.substring(value.length()-4),10);
    } else {
        x = Integer.valueOf(value,10);
    }
    x %= 1000;
    if(x >= 100){
        buffer.append(operator.getName(x / 100));
        buffer.append( ONES_SEPARATOR );
        buffer.append(STANDARD.getName(EXPONENT) );
    }
    String tensName = toTensName.getName(x % 100);
    if(!tensName.equals("") && (x >= 100)){
        buffer.append(ONES_SEPARATOR);
    }
    buffer.append(tensName);
    return buffer.toString();
}
