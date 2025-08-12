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
    boolean negative = false;
    if (value.charAt(0) == '-') {
        negative = true;
        value = value.substring (1);
    }
    int decimalIdx = value.indexOf (".");
    String decValue = (decimalIdx >= 0) ? value.substring (decimalIdx + 1) : null;
    value = (decimalIdx >= 0) ? value.substring (0, decimalIdx) : value;
    String name = processor.getName (value);
    name = (name.isEmpty ()) ? ZERO_TOKEN : name;
    name = (negative) ? MINUS + SEPARATOR + name : name;
    if (decValue != null && !decValue.isEmpty ()) {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName (decValue) + SEPARATOR + SCALE.getName (- decValue.length ());
    }
    return name;
}


