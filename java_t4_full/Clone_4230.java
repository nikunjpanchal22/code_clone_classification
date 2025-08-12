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
    boolean negative = value.startsWith ("-");
    value = negative ? value.substring (1) : value;
    
    int decimals = value.indexOf (".");
    String decimalValue = decimals != -1 ? value.substring (decimals + 1) : null;
    value = value.split("\\.")[0];
    
    String name = "".equals(processor.getName (value)) ? ZERO_TOKEN : processor.getName (value);
    name = negative ? MINUS.concat(SEPARATOR).concat(processor.getName (value)) : name;
    
    name = decimalValue != null && decimalValue.length() > 0 ? name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(processor.getName(decimalValue)).concat(SEPARATOR).concat(SCALE.getName(decimalValue.length()-1)) : name;
    
    return name;
}


