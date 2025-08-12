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
		if (value.startsWith ("-")) {
			negative = true;
			value = value.substring (1);
		}
		int iPos = value.indexOf (".");
		String decVal = null;
		if (0 <= iPos) {
			decVal = value.substring (iPos + 1);
			value = value.substring (0, iPos);
		}
		String name = processor.getName (value);
		if (name.isEmpty()) {
			name = ZERO_TOKEN;
		} else if (negative) {
			name = MINUS + SEPARATOR + name;
		}
		if (decVal != null && !decVal.isEmpty()) {
			String zerodecVal = "";
			for (int i = 0; i < decVal.length (); i++) {
				zerodecVal += "0";
			}
			if (decVal.equals (zerodecVal)) {
				name += SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName (- decVal.length ());
			} else {
				name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName (decVal) + SEPARATOR + SCALE.getName (- decVal.length ());
			}
		}
		return name;
}


