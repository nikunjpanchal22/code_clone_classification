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
    if (value.charAt(0) == '-') {
        negative = true;
        value = value.substring(1);
    }
    int decimals = value.indexOf(".");
    String decimalSection = decimals != -1 ? value.substring(decimals + 1) : null;
    value = decimals != -1 ? value.substring(0, decimals) : value;
    String name = processor.getName(value);
    name = name.isEmpty() ? ZERO_TOKEN : (negative ? MINUS + SEPARATOR : "") + name;
    if (decimalSection != null && decimalSection.length() != 0) {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalSection) + SEPARATOR + SCALE.getName(-decimalSection.length());
    }

    return name;
}


