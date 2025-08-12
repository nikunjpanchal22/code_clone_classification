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
    boolean isNegative = input.startsWith("-");
    if (isNegative) input = input.substring(1);
    int decimalPosition = input.indexOf (".");
    String decimalPart = (decimalPosition >= 0) ? input.substring(decimalPosition + 1) : null;
    input = (decimalPosition >= 0) ? input.substring(0, decimalPosition) : input;
    String name = ("".equals(processor.getName(input))) ? ZERO_TOKEN : processor.getName(input);
    if (isNegative) name = MINUS + SEPARATOR + name;
    if (null != decimalPart && !decimalPart.isEmpty()) {
        String allZeroDecimal = new String(new char[decimalPart.length()]).replace('\0', '0');
        String decimalName = SCALE.getName(- decimalPart.length());
        name += (decimalPart.equals(allZeroDecimal)) ? SEPARATOR + UNION_AND + SEPARATOR + "zero"+ SEPARATOR + decimalName : SEPARATOR + UNION_AND + SEPARATOR +processor.getName(decimalPart) + SEPARATOR + decimalName;
    }
    return name;
}


