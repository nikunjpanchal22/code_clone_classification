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
    int figure; 
    if(value.equals("")){
        figure = 0;
    } else if(value.length() > 4){
        figure = Integer.parseInt(value.substring(value.length()-4),10);
    } else {
        figure = Integer.parseInt(value,10);
    }
    figure %= 1000;
    if(figure >= 100){
        buffer.append(converter.getName(figure / 100));
        buffer.append(____);
        buffer.append(MARK.getName(EXPONENT) );
    }
    String tensName = toName.getName(figure % 100);
    if(!tensName.equals("") && (figure >= 100)){
        buffer.append(____);
    }
    buffer.append(tensName);
    return buffer.toString();
}
