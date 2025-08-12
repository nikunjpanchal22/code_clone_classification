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
    boolean negativeFlag = value.startsWith("-");
    if(negativeFlag) value = value.substring(1);
    int decimalIndex = value.indexOf(".");
    String decimalValue = decimalIndex == -1 ? null : value.substring(decimalIndex + 1);
    value = decimalIndex == -1 ? value : value.substring(0, decimalIndex);
    String name = "".equals(processor.getName(value)) ? ZERO_TOKEN : processor.getName(value);
    name = negativeFlag ? MINUS.concat(SEPARATOR).concat(name) : name;
    if(decimalValue != null) {
        boolean decimalFlag = decimalValue.matches("0+");
        name += SEPARATOR + UNION_AND + SEPARATOR + (decimalFlag ? "zero" : processor.getName(decimalValue)) + SEPARATOR + SCALE.getName(-decimalValue.length());
    }
    return name;
}


