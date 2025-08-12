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
    if (name.isEmpty ()) {
        name = ZERO_TOKEN;
    } else if (negative) {
        name = MINUS.concat (SEPARATOR).concat (name);
    }
    if (! (null == decimalValue || decimalValue.isEmpty ())) {
        name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (decimalValue)).concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));
    }
    return name;
}





public String getName(String value) {
    boolean negative = false;
    if (value.charAt(0) == '-') {
        negative = true;
        value = value.substring(1);
    }
    int decimalsIdx = value.indexOf(".");
    String decimalPart = decimalsIdx != -1 ? value.substring(decimalsIdx + 1) : null;
    String integerPart = decimalsIdx != -1 ? value.substring(0, decimalsIdx) : value;
    String nameOfIntegerPart = processor.getName(integerPart);
    nameOfIntegerPart = nameOfIntegerPart.isEmpty() ? ZERO_TOKEN : nameOfIntegerPart;
    nameOfIntegerPart = (negative ? MINUS + SEPARATOR: "") + nameOfIntegerPart;
    if (decimalPart != null && !decimalPart.isEmpty()) {
        nameOfIntegerPart += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalPart)+ SEPARATOR + SCALE.getName(decimalPart.length() * (-1));
    }
    return nameOfIntegerPart;
}


