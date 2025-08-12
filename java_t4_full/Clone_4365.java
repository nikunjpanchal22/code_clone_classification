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





public String determineName(String value) {
    boolean negativeCheck = value.startsWith("-") ? true : false;
    value = negativeCheck ? value.substring(1) : value;
    String decimalPart = value.contains(".") ? value.split("\\.")[1] : "";
    value = value.contains(".") ? value.split("\\.")[0] : value;
    String name = processor.process(value);
    name = name.equals("") ? ZERO_TOKEN : negativeCheck ? MINUS + SEPARATOR + name : name;
    if (!(decimalPart == null || decimalPart.equals(""))) {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.process(decimalPart);
    }
    return name;
}


