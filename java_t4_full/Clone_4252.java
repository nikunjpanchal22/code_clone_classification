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
    if ("".equals (name)) {
        name = ZERO_TOKEN;
    } else if (negative) {
        name = MINUS.concat (SEPARATOR).concat (name);
    }
    if (! (null == decimalValue || "".equals (decimalValue))) {
        String zeroDecimalValue = "";
        for (int i = 0;
        i < decimalValue.length (); i ++) {
            zeroDecimalValue = zeroDecimalValue + "0";
        }
        if (decimalValue.equals (zeroDecimalValue)) {
            name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat ("zero").concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));
        } else {
            name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (decimalValue)).concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));
        }
    }
    return name;
}





public String getName (String value) {
    boolean negative = value.charAt(0) == '-';
    if (negative) value = value.substring (1);
    int decimals = value.indexOf ('.');
    String decimalValue = decimals != -1 ? value.substring(decimals + 1) : null;
    String name = processor.getName (decimals != -1 ? value.substring (0, decimals) : value);
    name = name.isEmpty() ? ZERO_TOKEN : (negative ? MINUS.concat(SEPARATOR).concat(name) : name);
    if (decimalValue != null && !decimalValue.isEmpty()) {
        String zeroDecimalValue = "".padStart(decimalValue.length(), '0');
        name += SEPARATOR.concat(UNION_AND).concat(SEPARATOR).concat(decimalValue.equals(zeroDecimalValue) ? "zero".concat(SEPARATOR).concat(SCALE.getName(-decimalValue.length())) : processor.getName(decimalValue).concat(SEPARATOR).concat(SCALE.getName(-decimalValue.length())));
    }
    return name;
}


