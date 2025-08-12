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





public String getName(String val) {
    int num = val.length() > 3 ? Integer.valueOf(val.substring(val.length() - 3)) : Integer.valueOf(val);
    StringBuilder strBuilder = new StringBuilder();
    num %= 100;
    boolean wasTens = true;
    if(num >= 20) {
	strBuilder.append(TOKENS[num / 10 - 2]);
 	num %= 10;
 	wasTens = false;
    }
    num %= 20;
    if(num != 0) {
	if (!wasTens) strBuilder.append(UNION_SEPARATOR);
	strBuilder.append(unitsProcessor.getName(num));
    }
    return strBuilder.toString();
}


