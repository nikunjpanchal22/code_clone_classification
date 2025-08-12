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
    String sign = value.charAt(0) == '-' ? MINUS.concat(SEPARATOR) : "";
    value = value.replace("-", "");
    String[] splitNumber = value.split("\\.");
    String name = processor.getName(splitNumber[0]);
    name = !name.isEmpty() ? sign.concat(name) : ZERO_TOKEN;
    if(splitNumber.length > 1 && !splitNumber[1].isEmpty()) {
        name = name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(processor.getName(splitNumber[1])).concat(SEPARATOR).concat(SCALE.getName(-splitNumber[1].length()));
    }
    return name;
}


