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
    boolean neg = value.startsWith("-");
    if (neg) value = value.substring(1);
    int dec = value.indexOf(".");
    String decVal = dec >= 0 ? value.substring(dec + 1) : null;
    value = dec >= 0 ? value.substring(0, dec) : value;
    String name = "".equals(processor.getName(value))? ZERO_TOKEN : processor.getName(value);
    if(neg) name = MINUS + SEPARATOR + name;
    if (decVal != null && !decVal.isEmpty()) {
        String zeroDecVal = new String(new char[decVal.length()]).replace('\0', '0');
        name += decVal.equals(zeroDecVal) ? SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(- decVal.length()) : SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decVal) + SEPARATOR + SCALE.getName(- decVal.length());
    }
    return name;
}


