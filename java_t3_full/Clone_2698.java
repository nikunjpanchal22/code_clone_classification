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





public String getName (String input) {
boolean negative = false;
    if (input.startsWith ("-")) {
        negative = true;
        input = input.substring (1);
    }
    int point = input.indexOf (".");
    String decimalPoint = null;
    if (point >= 0) {
        decimalPoint = input.substring (point + 1);
        input = input.substring (0, point);
    }
    String name = ("".equals(processor.getName(input))) ? ZERO_TOKEN : processor.getName(input);
    if (negative) {
        name = MINUS + SEPARATOR.concat(name);
    }
    if (decimalPoint != null && !decimalPoint.isEmpty()) {
        String nullDecimalPoint = new String(new char[decimalPoint.length ()]).replace("\0", "0");
        if (decimalPoint.equals(nullDecimalPoint)) {
            name = name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat("zero").concat(SEPARATOR).concat(SCALE.getName(-decimalPoint.length()));
        } else {
            name = name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(processor.getName(decimalPoint)).concat(SEPARATOR).concat(SCALE.getName(-decimalPoint.length()));
        }
    }
    return name;
}


