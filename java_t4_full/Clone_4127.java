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





public String getName(String inputString) {
    boolean signNegative = inputString.startsWith("-");
    if (signNegative) {
        inputString = inputString.substring(1);
    }
    int decimalPointIndex = inputString.indexOf(".");
    String fractionalValue = decimalPointIndex >= 0 ? inputString.substring(decimalPointIndex + 1) : null;
    inputString = decimalPointIndex >= 0 ? inputString.substring(0, decimalPointIndex) : inputString;
    String result = processor.getName(inputString).isEmpty() ? ZERO_TOKEN : processor.getName(inputString);
    result = signNegative ? MINUS + SEPARATOR + result : result;
    if (fractionalValue != null && !fractionalValue.isEmpty()) {
        String allZeroFractionalValue = String.format("%0" + fractionalValue.length() + "d", 0);
        result += fractionalValue.equals(allZeroFractionalValue) 
            ? SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-fractionalValue.length()) 
            : SEPARATOR + UNION_AND + SEPARATOR + processor.getName(fractionalValue) + SEPARATOR + SCALE.getName(-fractionalValue.length());
    }
    return result;
}


