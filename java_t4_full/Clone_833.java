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



 public String getName (String userInput) {
    int decimalIndex = userInput.indexOf(".");
    String decimalValue = null;
    String name = null;
    boolean negative;

    if (userInput.startsWith("-")) {
        userInput = userInput.substring(1);
        negative = true;
    }
    else {
        negative = false;
    }

    if (decimalIndex >= 0) {
        decimalValue = userInput.substring(decimalIndex + 1);
        userInput = userInput.substring(0, decimalIndex);
    }

    name = processor.getName(userInput);

    if (name.equals("")) {
        name = ZERO_TOKEN;
    }
    else if (negative) {
        name = MINUS + SEPARATOR + name;
    }

    if (decimalValue != null && !decimalValue.equals("")) {
        String leadingZeros = "";
        int decimalLength = decimalValue.length();
        for (int i = 0; i < decimalLength; i++)
            leadingZeros = leadingZeros + "0";
        if (decimalValue.equals(leadingZeros)) {
            name = name + SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-1 * decimalLength);
        }
        else {
            name = name + SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalValue) + SEPARATOR + SCALE.getName(-1 * decimalLength);
        }
    }
    return name;
}


