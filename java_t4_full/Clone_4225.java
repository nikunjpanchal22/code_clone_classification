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
    StringBuilder sb = new StringBuilder();
    if(negative) sb.append(MINUS).append(SEPARATOR);
    sb.append(name);
    if(decimalValue != null) {
        sb.append(SEPARATOR).append(UNION_AND).append(SEPARATOR);
        if(decimalValue.equals(zeroDecimalValue)) {
            sb.append("zero").append(SEPARATOR).append(SCALE.getName(-decimalValue.length()));
        } else {
            sb.append(processor.getName(decimalValue)).append(SEPARATOR).append(SCALE.getName(-decimalValue.length()));
        }
    }
    return sb.toString();
}


