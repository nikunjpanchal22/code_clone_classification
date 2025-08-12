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
    int dotIndex = value.indexOf(".");
    String decimalValue = dotIndex != -1 ? value.split("\\.")[1] : null;
    boolean negative = value.startsWith("-");

    value = negative ? value.substring(1) : value;
    String name = negative && !processor.getName(value).isEmpty() ? MINUS.concat (SEPARATOR).concat (processor.getName(value)) : processor.getName(value);
    name = name.isEmpty () ? ZERO_TOKEN : name;

    if (decimalValue != null && !decimalValue.isEmpty()) {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-decimalValue.length());
    }
    return name;
}


