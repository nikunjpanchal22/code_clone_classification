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
    boolean isNegative = value.charAt (0) == '-';
    value = isNegative ? value.substring (1) : value;
    
    int decimals = value.indexOf (".");
    String decimalPart = (0 <= decimals) ? value.substring (decimals + 1) : null;
    String integerPart = (0 <= decimals) ? value.substring (0, decimals) : value;
    
    String name = processor.getName (integerPart);
    name = (name.isEmpty()) ? ZERO_TOKEN : name;
    
    if (isNegative)
        name = MINUS + SEPARATOR + name;

    if (!(null == decimalPart || decimalPart.isEmpty())) {
        String zeroDecimalValue = IntStream.range(0,decimalPart.length()).mapToObj(i -> "0").collect(Collectors.joining(""));
        name += SEPARATOR + UNION_AND + SEPARATOR + (zeroDecimalValue.equals(decimalPart) ? "zero" : processor.getName(decimalPart)) + SEPARATOR + SCALE.getName(-decimalPart.length());
    }

    return name;
}


