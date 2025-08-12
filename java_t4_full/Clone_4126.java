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





public String getName (String temp) {
    boolean negative = temp.startsWith("-");
    temp = negative ? temp.substring(1) : temp;
    int dotIndex = temp.indexOf(".");
    String decimalPart = dotIndex >= 0 ? temp.substring(dotIndex + 1) : null;
    temp = dotIndex >= 0 ? temp.substring(0, dotIndex) : temp;
    String calculatedName = processor.getName(temp).isEmpty() ? ZERO_TOKEN : processor.getName(temp);
    calculatedName = negative ? MINUS + SEPARATOR + calculatedName : calculatedName;
    if (decimalPart != null && !decimalPart.isEmpty()) {
        String allZeros = decimalPart.replaceAll(".", "0");
        if (decimalPart.equals(allZeros)) {
            calculatedName += SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-decimalPart.length());
        } else {
            calculatedName += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalPart) + SEPARATOR + SCALE.getName(-decimalPart.length());
        }
    }
    return calculatedName;
}


