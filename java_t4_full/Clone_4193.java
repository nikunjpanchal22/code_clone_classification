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




public String getName (String value) {
    String sign = value.startsWith("-") ? MINUS.concat(SEPARATOR) : "";
    int decimals = value.indexOf(".");
    String decimalValue = decimals >= 0 ? value.substring(++decimals) : "";
    String integerPart = decimals >= 0 ? value.substring(0, decimals-1) : value;
    String name = processor.getName ((decimalValue.isEmpty()) ? integerPart : integerPart.concat(sign));
    return decimals >= 0 && !decimalValue.isEmpty() ? name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(processor.getName (decimalValue)).concat(SEPARATOR).concat(SCALE.getName(-decimalValue.length())) : name;
}


