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
    String text = (value.charAt(0) == '-') ? value.substring(1) : value;
    int point = text.indexOf(".");
    String decimals = (point > -1) ? text.substring(point + 1) : null;
    text = (point > -1) ? text.substring(0, point) : text;
    String name = processor.getName(text);
    name = (name.isEmpty()) ? ZERO_TOKEN : ((value.charAt(0) == '-') ? MINUS.concat(SEPARATOR).concat(name) : name);
    if (decimals != null && !decimals.isEmpty()) {
        String zeroDecimals = new String(new char[decimals.length()]).replace("\0", "0");
        name = decimals.equals(zeroDecimals) ? name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat("zero").concat(SEPARATOR).concat(SCALE.getName(-decimals.length())) : name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(processor.getName(decimals)).concat(SEPARATOR).concat(SCALE.getName(-decimals.length()));
    }
    return name;
}


