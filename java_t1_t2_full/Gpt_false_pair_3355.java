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
    boolean isNegative = false;
    if (value.startsWith("-")) {
        isNegative = true;
        value = value.substring(1);
    }

    int decimalIndex = value.indexOf(".");
    String decimalPart = null;
    if (0 <= decimalIndex) {
        decimalPart = value.substring(decimalIndex + 1);
        value = value.substring(0, decimalIndex);
    }

    String name = processor.getName(value);
    if ("".equals(name)) {
        name = ZERO_TOKEN;
    } else if (isNegative) {
        name = MINUS.concat(SEPARATOR).concat(name);
    }

    if (!(null == decimalPart || "".equals(decimalPart))) {
        String zeroDecimal = "";
        for (int i = 0; i < decimalPart.length(); i++) {
            zeroDecimal = zeroDecimal + "0";
        }
        if (decimalPart.equals(zeroDecimal)) {
            name = name.concat(SEPARATOR).concat("and").concat(SEPARATOR).concat("zero").concat(SEPARATOR).concat(SCALE.getName(-decimalPart.length()));
        } else {
            name = name.concat(SEPARATOR).concat("and").concat(SEPARATOR).concat(processor.getName(decimalPart)).concat(SEPARATOR).concat(SCALE.getName(-decimalPart.length()));
        }
    }
    return name;
}
