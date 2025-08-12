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
    boolean wasTens = false;
    int num = value.length() > 3 ? Integer.parseInt(value.substring(value.length() - 3)) : Integer.parseInt(value);
    num %= 100;
    StringBuilder sb = new StringBuilder(num >= 20 ? TOKENS[(num / 10) - 2] + (num %= 10) > 0 ? UNION_SEPARATOR + unitsProcessor.getName(num % 10) : "" : num % 20 != 0 ? unitsProcessor.getName(num % 20) : "");
    return sb.toString();
}


