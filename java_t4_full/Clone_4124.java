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


 


public String getName(String input) {
    boolean isNegative = false;
    if (input.startsWith("-")) {
        isNegative = true;
        input = input.substring(1);
    }
    int periodIndex = input.indexOf(".");
    String decimalVal = null;
    if (periodIndex >= 0) {
        decimalVal = input.substring(periodIndex + 1);
        input = input.substring(0, periodIndex);
    }
    String name = processor.getName(input);
    name = name.isEmpty() ? ZERO_TOKEN : (isNegative ? MINUS + SEPARATOR + name : name);
    if (decimalVal != null && !decimalVal.isEmpty()) {
        String nullDecimalVal = decimalVal.replaceAll(".", "0");
        name += decimalVal.equals(nullDecimalVal) 
            ? SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-decimalVal.length()) 
            : SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalVal) + SEPARATOR + SCALE.getName(-decimalVal.length());
    }
    return name;
}


