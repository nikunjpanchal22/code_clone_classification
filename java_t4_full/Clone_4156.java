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
    String negativeSign = value.startsWith("-") ? MINUS.concat(SEPARATOR) : "";
    value = value.replace("-", "");
    int dotIndex = value.indexOf(".");
    String integerValue = dotIndex >= 0 ? value.substring(0, dotIndex) : value;
    String decimalValue = dotIndex >= 0 ? value.substring(dotIndex+1) : null;
    String name = processor.getName(integerValue);
    if(negativeSign.length() > 0 || !name.isEmpty()) {
        if (name.isEmpty()){
            name = ZERO_TOKEN;
        }
        name = negativeSign.concat(name);
    }
    if(decimalValue != null && !decimalValue.isEmpty()){
        if(decimalValue.equals("0")){
            name = name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat("zero").concat(SEPARATOR).concat(SCALE.getName(-decimalValue.length()));
        }else{
            name = name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(processor.getName(decimalValue)).concat(SEPARATOR).concat(SCALE.getName(-decimalValue.length()));
        }
    }
    return name;
}


