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
    boolean negativeVal = false;
    if (value.startsWith("-")) {
        negativeVal = true;
        value = value.substring(1);
    }
    int decimalPlace = value.indexOf(".");
    String decimalValue = null;
    if (decimalPlace >= 0) {
        decimalValue = value.substring(decimalPlace + 1);
        value = value.substring(0, decimalPlace);
    }
    String resultName = processor.getName(value).isEmpty() ? ZERO_TOKEN : processor.getName(value);
    if (negativeVal) {
        resultName = MINUS + SEPARATOR + resultName;
    }
    if (decimalValue != null && !decimalValue.isEmpty()) {
        String allZeroDecimalValue = String.format("%0" + decimalValue.length() + "d", 0);
        resultName += decimalValue.equals(allZeroDecimalValue) ? SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-decimalValue.length()) : SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-decimalValue.length());
    }
    return resultName;
}


