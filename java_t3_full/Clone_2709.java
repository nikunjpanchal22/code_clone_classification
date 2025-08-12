public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    boolean tensFound = false;
    int number;
    if (value.length () > 3) {
        number = Integer.valueOf (value.substring (value.length () - 3), 10);
    } else {
        number = Integer.valueOf (value, 10);
    }
    number %= 100;
    if (number >= 20) {
        buffer.append (TOKENS [(number / 10) - 2]);
        number %= 10;
        tensFound = true;
    } else {
        number %= 20;
    }
    if (number != 0) {
        if (tensFound) {
            buffer.append (UNION_SEPARATOR);
        }
        buffer.append (unitProcessor.getName (number));
    }
    return buffer.toString ();
}





public String getName(String inputValue) { 
    StringBuilder text = new StringBuilder();
    int num = inputValue.length() > 3 ? Integer.parseInt(inputValue.substring(inputValue.length() - 3)) : Integer.parseInt(inputValue);
    boolean tensChecked = false;
    num %= 100;
    if(num >= 20) {
	text.append(TOKENS[num / 10 - 2]);
	num %= 10;
	tensChecked = true;
    }
    num %= 20;
    if(num != 0) {
	if (tensChecked) text.append(UNION_SEPARATOR);
	text.append(unitsProcessor.getName(num));
    }
    return text.toString();
}


