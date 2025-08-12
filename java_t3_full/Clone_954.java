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


 public static String getName (String value) {
    boolean negative = false;
    if (value.startsWith("-")) {
        negative = true;
        value = value.substring(1);
    }
    // Capture the position of the decimal point, if found
    int decimals = value.indexOf(".");
    String decimalValue = null;
    if (0 <= decimals) {
        decimalValue = value.substring(decimals + 1);
        value = value.substring(0, decimals);
    }
    String name = processor.getName(value);
    if ("".equals(name)) {
        name = ZERO_TOKEN;
    } else if (negative) {
        name = MINUS + SEPARATOR + name;
    }
    // If there is a decimal part
    if (decimalValue != null) {
        // Create a string of 0 for comparison
        String zeroDecimalValue = "";
        for (int i = 0; 
            i < decimalValue.length(); i++) {
            zeroDecimalValue += "0";
        }
        // If the decimal part is all 0
        if (decimalValue.equals(zeroDecimalValue)) {
            name = name 
                    + SEPARATOR 
                    + UNION_AND 
                    + SEPARATOR + "zero" 
                    + SEPARATOR 
                    + SCALE.getName(- decimalValue.length());
        } else {
            // Decimals are not all 0
            name = name
                    + SEPARATOR 
                    + UNION_AND
                    + SEPARATOR
                    + processor.getName(decimalValue)
                    + SEPARATOR 
                    + SCALE.getName(- decimalValue.length());
        }
    }
    return name;
}


