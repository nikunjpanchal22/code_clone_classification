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
		boolean mark = false;
		if (value.startsWith ("-")) {
			mark = true;
			value = value.substring (1);
		}
		int index = value.indexOf (".");
		String decimalval = null;
		if (0 <= index) {
			decimalval = value.substring (index + 1);
			value = value.substring (0, index);
		}
		String name = processor.getName (value);
		if (name.equals ("")) {
			name = ZERO_TOKEN;
		} else if (mark) {
			name = MINUS + SEPARATOR + name;
		}
		if (decimalval != null && !decimalval.equals ("")) {
			String zerodecimalval = "";
			for (int i = 0; i < decimalval.length (); i++) {
				zerodecimalval += "0";
			}
			if (decimalval.equals (zerodecimalval)) {
				name += SEPARATOR + UNION_AND + SEPARATOR + "zero" + SEPARATOR + SCALE.getName (- decimalval.length ());
			} else {
				name += SEPARATOR + UNION_AND + SEPARATOR + processor.getName (decimalval) + SEPARATOR + SCALE.getName (- decimalval.length ());
			}
		}
		return name;
}


