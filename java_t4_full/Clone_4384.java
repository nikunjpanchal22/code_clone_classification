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
    boolean minus = value.charAt(0) == '-';
    if(minus) value = value.substring(1);
    int pointPos = value.indexOf(".");
    String decimalPart = (pointPos > -1) ? value.substring(pointPos + 1) : null;
    value = (pointPos > -1) ? value.substring(0, pointPos) : value;
    String name = "".equals(processor.getName(value)) ? ZERO_TOKEN : processor.getName(value);
    if(minus) name = MINUS + SEPARATOR + name;
    if(decimalPart != null && !"".equals(decimalPart)) {
        String zeros = decimalPart.replaceAll("[^0]", "");
        if(zeros.equals(decimalPart)) name += SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-decimalPart.length());
        else name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalPart) + SEPARATOR + SCALE.getName(-decimalPart.length());
    }
    return name;
}


