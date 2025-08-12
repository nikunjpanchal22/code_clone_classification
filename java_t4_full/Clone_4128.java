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

    int firstDecimal = value.indexOf(".");
    String decimalValue = null;

    if (firstDecimal >= 0) {
        decimalValue = value.substring(firstDecimal + 1);
        value = value.substring(0, firstDecimal);
    }

    String name = processor.getName(value);
    name = name.isEmpty() ? ZERO_TOKEN : name;

    if (negative) {
        name = MINUS + SEPARATOR + name;
    }

    if (decimalValue != null && decimalValue.length() > 0) {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-decimalValue.length());
    }

    return name;
}


