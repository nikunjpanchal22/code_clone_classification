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
    boolean negative = value.charAt(0) == '-' ? true : false;
    value = negative ? value.substring(1) : value;
    
    int decimals = value.indexOf (".");
    String decimalValue = decimals >= 0 ? value.substring (decimals + 1) : null;
    value = decimals >= 0 ? value.substring (0, decimals) : value;
    
    String name = processor.getName (value);
    
    name = name.isEmpty() ? ZERO_TOKEN : negative ? MINUS.concat(SEPARATOR).concat(name) : name;
    
    name = decimalValue != null && !decimalValue.isEmpty() ? name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(processor.getName(decimalValue)).concat(SEPARATOR).concat(SCALE.getName(-decimalValue.length())) : name;
    
    return name;
}


