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
    boolean minus = false;
    if(value.charAt(0) == '-') {
        minus = true;
        value = value.replace("-", "");
    }
    String[] parts = value.split("\\.");
    String name = processor.getName(parts[0]);
    name = StringUtils.defaultIfEmpty(name, ZERO_TOKEN);
    name = minus? MINUS + SEPARATOR + name: name;
    if (parts.length > 1) {
        String decimal = processor.getName(parts[1]);
        name += SEPARATOR + UNION_AND + SEPARATOR + decimal + SEPARATOR + SCALE.getName(-parts[1].length());
    }
    return name;
}


