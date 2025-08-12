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
    boolean negative = false;
    if (value.startsWith ("-")) {//check to see if negative
        negative = true;
        value = value.substring (1);//removes negative sign
    }
    int decimals = value.indexOf ("."); //find decimals
    String decimalValue = null;
    if(0 <= decimals){//check to see if decimals exist in string
        decimalValue = value.substring (decimals + 1);//Keeping decimal value
        value = value.substring (0, decimals);//removing decimal value from string
    }
    String name = processor.getName (value);
    if ("".equals (name)) {//if name is nothing set it to zero token
        name = ZERO_TOKEN;
    } else if (negative) {//if negative name is minus
        name = MINUS.concat ("-").concat (name);
    }
    if (! (null == decimalValue || "".equals (decimalValue))) {
        String zeroDecimalValue = "";
        for (int i = 0; 
        i < decimalValue.length (); i ++) {//loop to get rid of decimals
            zeroDecimalValue = zeroDecimalValue + "0";
        }
        if (decimalValue.equals (zeroDecimalValue)) {
            name = name.concat ("-").concat (UNION_AND).concat ("-").concat ("zero").concat ("-").concat (SCALE.getName (- decimalValue.length ()));
        } else {
            name = name.concat ("-").concat (UNION_AND).concat ("-").concat (processor.getName (decimalValue)).concat ("-").concat (SCALE.getName (- decimalValue.length ()));
        }
    }
    return name;
}
