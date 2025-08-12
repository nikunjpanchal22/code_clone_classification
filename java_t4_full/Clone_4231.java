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
    if (name.isEmpty ()) {
        name = ZERO_TOKEN;
    } else if (negative) {
        name = MINUS.concat (SEPARATOR).concat (name);
    }
    if (! (null == decimalValue || decimalValue.isEmpty ())) {
        name = name.concat (SEPARATOR).concat (UNION_AND).concat (SEPARATOR).concat (processor.getName (decimalValue)).concat (SEPARATOR).concat (SCALE.getName (- decimalValue.length ()));
    }
    return name;
}


 

public String getName (String value) {
    boolean isNegative = value.charAt(0) == '-';
    int dot = value.indexOf(".");
    
    String intact = isNegative ? value.substring(1, dot) : value.substring(0, dot);
    String decimalValue = value.substring(dot != -1 ? dot + 1 : value.length());
    
    String name = processor.getName (intact);
    name = name.isEmpty () ? ZERO_TOKEN : isNegative ? MINUS.concat (SEPARATOR).concat (name) : name;
    
    if (!decimalValue.isEmpty ()) {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName (decimalValue) + SEPARATOR + SCALE.getName(-decimalValue.length());
    }
    return name;
}


