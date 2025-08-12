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
    String prefix = value.startsWith("-") ? MINUS.concat(SEPARATOR) : "";
    String[] parts = value.replace("-", "").split("\\.");
    String name = prefix.concat(processor.getName(parts[0]));
    if(name.isEmpty()) name = ZERO_TOKEN;
    if(parts.length > 1 && !parts[1].isEmpty()) {
        name = name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(processor.getName(parts[1])).concat(SEPARATOR).concat(SCALE.getName(-parts[1].length()));
    }
    return name;
}


