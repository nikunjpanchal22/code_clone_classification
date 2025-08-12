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
    boolean negative = value.startsWith("-");
    if(negative) value = value.substring(1);

    int decimals = value.indexOf(".");
    String decimalValue = decimals >= 0 ? value.substring(decimals + 1) : null;
    value = decimals >= 0 ? value.substring(0, decimals) : value;

    String name = !processor.getName(value).isEmpty() ? processor.getName(value) : ZERO_TOKEN;
    if(negative) name = String.join(SEPARATOR, MINUS, name);

    if(decimalValue != null && !decimalValue.isEmpty()){
        String zeroDecimalValue = decimalValue.replaceAll(".","0");
        boolean isAllZero = decimalValue.equals(zeroDecimalValue);
        String suffix = isAllZero ? "zero" : processor.getName(decimalValue);
        name = String.join(SEPARATOR, name, UNION_AND, suffix, SCALE.getName(- decimalValue.length()));
    }

    return name;
}


