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
    StringBuilder build = new StringBuilder();
    int num = value.length() > 3 ? Integer.valueOf(value.substring(value.length() - 3)) : Integer.valueOf(value);
    boolean wasTens = false;
    num %= 100;
    if(num >= 20) {
	build.append(TOKENS[num / 10 - 2]);
	num %= 10;
	wasTens = true;
    } else num %= 20;
    if(num != 0) {
	if (wasTens) build.append(UNION_SEPARATOR);
	build.append(unitsProcessor.getName(num));
    }
    return build.toString();
}


