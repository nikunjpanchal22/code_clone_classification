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
    boolean negative = value.startsWith("-");
    value = negative ? value.substring(1) : value;
    int dotIndex = value.indexOf(".");
    String decimalVal = (dotIndex >= 0) ? value.substring(dotIndex + 1) : null;
    value = (dotIndex >= 0) ? value.substring(0, dotIndex) : value;
    String name = processor.getName(value);
    name = name.isEmpty() ? ZERO_TOKEN : (negative ? MINUS + SEPARATOR + name : name);
    if (decimalVal != null && !decimalVal.isEmpty()) {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalVal) + SEPARATOR + SCALE.getName(decimalVal.length() * -1);
    }
    return name;
}


