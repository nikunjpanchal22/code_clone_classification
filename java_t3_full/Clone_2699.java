public String getName (String value) {
    boolean negative = false;
    if (value.startsWith ("-")) {
        negative = true;
        value = value.substring (1);
    }
    int decimals = value.indexOf (".");
    String decimalValue = null;
    if (0 <= decimals) {
        decimalValue = value.substring (decimals + 1);
        value = value.substring (0, decimals);
    }
    String name = processor.getName (value);
    if (name.isEmpty ()) {
        name = ZERO_TOKEN;
    } else if (negative) {
        name = MINUS.concat (SEPARATOR).concat (name);
    }
    if (! (null == decimalValue || decimalValue.isEmpty ())) {
        name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (decimalValue)).concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));
    }
    return name;
}





public String getName(String value) {
    boolean negative = false;
    if (value.startsWith("-")) {
        negative = true;
        value = value.substring(1);
    }
    int index = value.indexOf(".");
    String remainder = null;
    if (index > -1) {
        remainder = value.substring(index + 1);
        value = value.substring(0, index);
    }
    String name = processor.getName(value);
    name = name.isEmpty() ? ZERO_TOKEN : (negative ? MINUS.concat(SEPARATOR).concat(name) : name);
    if (remainder != null && !remainder.isEmpty()) {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(remainder) + SEPARATOR + SCALE.getName(-remainder.length());
    }
    return name;
}


