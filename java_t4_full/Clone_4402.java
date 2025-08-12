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
    boolean negative = value.charAt(0) == '-';
    
    if(negative) value = value.substring(1);
    
    String decimalValue = null;
    int decimals = value.indexOf(".");
    
    if(decimals >= 0){
        decimalValue = value.substring(decimals + 1);
        value = value.substring(0, decimals);
    }

    String name = processor.getName(value);
    name = name.isEmpty() ? ZERO_TOKEN : name;
    
    if(negative) name = MINUS + SEPARATOR + name;
    
    if(decimalValue != null && !decimalValue.isEmpty()){
        String zeroDecimalValue = decimalValue.replaceAll(".","0");
        name += SEPARATOR + UNION_AND + SEPARATOR + (decimalValue.equals(zeroDecimalValue) ? "zero" : processor.getName(decimalValue)) + SEPARATOR + SCALE.getName(-decimalValue.length());
    }
    
    return name;
}


