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
    BigDecimal bValue = new BigDecimal(value);
    BigInteger iValue = bValue.toBigInteger();
    String name = processor.getName(iValue.toString());
    if(bValue.signum() == -1){
        name = MINUS.concat(SEPARATOR).concat(name);
    }
    BigDecimal fraction = bValue.remainder(BigDecimal.ONE);
    if(fraction.compareTo(BigDecimal.ZERO) != 0){
        String fractName = processor.getName(value.substring(value.indexOf(".") + 1));
        name = name.concat(SEPARATOR).concat(UNION_AND).concat(SEPARATOR).concat(fractName).concat(SEPARATOR).concat(SCALE.getName(-fractName.length()));
    }
    return name;
}


