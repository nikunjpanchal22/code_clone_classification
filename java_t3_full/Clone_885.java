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
		boolean sign = false;
		if (value.startsWith ("-")) {
			sign = true;
			value = value.substring (1);
		}
		int position = value.indexOf (".");
		String decimalNum = null;
		if (0 <= position) {
			decimalNum = value.substring (position + 1);
			value = value.substring (0, position);
		}
		String name = processor.getName(value);
		if (name.equals("")) {
			name = ZERO_TOKEN;
		} else if (sign) {	
			name = MINUS + SEPARATOR + name;
		}
		if (decimalNum != null && !decimalNum.equals("")) {
			String zeroString = "";
			for (int i = 0; i < decimalNum.length(); i++) {
				zeroString += "0";
			}
			if (decimalNum.equals (zeroString)) {
				name = name + SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName(- decimalNum.length());
			} else {
				name = name + SEPARATOR + UNION_AND + SEPARATOR + processor.getName (decimalNum) + SEPARATOR + SCALE.getName(- decimalNum.length());
			}
		}
		return name;
}


