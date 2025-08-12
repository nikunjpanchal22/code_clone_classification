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





public String getName(String value) {
    StringBuilder buildStr = new StringBuilder();
    int numbers = value.length() > 3 ? Integer.valueOf(value.substring(value.length() - 3)) : Integer.valueOf(value);
    boolean tensPresent = false;
    numbers %= 100;
    if(numbers >= 20) {
	buildStr.append(TOKENS[numbers / 10 - 2]);
	numbers %= 10;
	tensPresent = true;
    } else numbers %= 20;
    if(numbers != 0) {
	if (tensPresent) buildStr.append(UNION_SEPARATOR);
	buildStr.append(unitsProcessor.getName(numbers));
    }
    return buildStr.toString();
}


