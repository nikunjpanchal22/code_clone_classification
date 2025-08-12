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
    StringBuilder strBuilder = new StringBuilder();
    boolean wasTens = false;
    int num = value.length() > 3 ? Integer.parseInt(value.substring(value.length() - 3)) : Integer.parseInt(value);
    num %= 100;
    if(num >= 20) {
	strBuilder.append(TOKENS[num / 10 - 2]);
	num %= 10;
	wasTens = true;
    }
    num %= 20;
    if(num != 0) {
	if (wasTens) 
	    strBuilder.append(UNION_SEPARATOR);
	strBuilder.append(unitsProcessor.getName(num));
    }
    return strBuilder.toString();
}


