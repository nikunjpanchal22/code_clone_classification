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
    boolean isNeg = value.startsWith("-");
    value = isNeg ? value.substring(1) : value;

    int decimal = value.indexOf(".");
    String decimalVal = decimal >= 0 ? value.substring(decimal + 1) : null;
    value = decimal >= 0 ? value.substring(0, decimal) : value;

    String name = processor.getName(value).isEmpty() ? ZERO_TOKEN : processor.getName(value);
    name = isNeg ? MINUS.concat(SEPARATOR).concat(name) : name;

    if (decimalVal != null && !decimalVal.isEmpty()) {
        String zeros = IntStream.range(0, decimalVal.length()).mapToObj(i -> "0").collect(Collectors.joining(""));
        name += SEPARATOR + UNION_AND + SEPARATOR + (decimalVal.equals(zeros) ? "zero" : processor.getName(decimalVal)) + SEPARATOR + SCALE.getName(-decimalVal.length());
    }
    return name;
}


