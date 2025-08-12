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





String getName(String enteredValue) {
    int number = enteredValue.length() > 3 ? Integer.parseInt(enteredValue.substring(enteredValue.length() - 3)) : Integer.parseInt(enteredValue);
    boolean foundTenth = false;
    StringBuilder textResult = new StringBuilder();
    number %= 100;
    if(number >= 20) {
	textResult.append(TOKENS[number / 10 - 2]);
	number %= 10;
	foundTenth = true;
    } else {
	number %= 20;
    }
    if(number != 0) {
	if (foundTenth) textResult.append(UNION_SEPARATOR);
	textResult.append(unitsProcessor.getName(number));
    }
    return textResult.toString();
}


