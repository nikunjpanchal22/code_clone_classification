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
    value = isNegative ? value.substring(1) : value;
    int decimalPoint = value.indexOf(".");
    String decimalValue = decimalPoint != -1 ? value.substring(decimalPoint + 1) : null;
    String name = processor.getName(value.split("\\.")[0]);
    name = "".equals(name) ? ZERO_TOKEN : name;
    name = isNegative ? MINUS.concat(SEPARATOR).concat(name) : name;
    if(decimalValue != null && !decimalValue.isEmpty()) {
        String zeroValue = decimalValue.replaceAll("[1-9]", "0");
        name += SEPARATOR + UNION_AND + SEPARATOR + (decimalValue.equals(zeroValue) ? "zero" : processor.getName(decimalValue)) + SEPARATOR + SCALE.getName(-decimalValue.length());
    }
    return name;
}


