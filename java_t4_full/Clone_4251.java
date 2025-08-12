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





public String getName(String value) {
    boolean isNegative = value.charAt(0) == '-';
    if (isNegative) value = value.substring (1);
    int indexOfDecimal = value.indexOf(".");
    String decimalValue = indexOfDecimal >= 0 ? value.substring(indexOfDecimal + 1) : null;
    String mainName = "".equals(processor.getName(value.substring (0, indexOfDecimal))) ? ZERO_TOKEN : processor.getName(value.substring (0, indexOfDecimal));
    mainName = isNegative ? MINUS.concat(SEPARATOR).concat(mainName) : mainName;
    if (decimalValue != null && !decimalValue.isEmpty()) {
        String allZeroDecimal = "".padStart(decimalValue.length(), '0');
        mainName += SEPARATOR.concat(UNION_AND).concat(SEPARATOR).concat(decimalValue.equals(allZeroDecimal) ? "zero" + SEPARATOR + SCALE.getName(- decimalValue.length()) : processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-decimalValue.length()));
    }
    return mainName;
}


