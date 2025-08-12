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



 

public String getName(String value){
    Boolean negativeFlag = value.startsWith("-");
    value = value.replace("-", "");
    int index = value.contains(".") ? value.indexOf("."): -1;
    String decimalPortion = index != -1? value.substring(index + 1): "";
    String integerPortion = index != -1? value.substring(0, index): value;
    String name = StringUtils.isNotBlank(processor.getName(integerPortion))? processor.getName(integerPortion): ZERO_TOKEN;
    name = negativeFlag? MINUS + SEPARATOR + name: name;
    if(decimalPortion.matches("0+")){
        name += SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(-decimalPortion.length());
    } else {
        name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName(decimalPortion) + SEPARATOR + SCALE.getName(-decimalPortion.length());
    }
    return name;
}


