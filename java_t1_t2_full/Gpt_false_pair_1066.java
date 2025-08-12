public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    String high, low;
    if (value.length () < getPartDivider ()) {
        high = "";
        low = value;
    } else {
        int index = value.length () - getPartDivider ();
        high = value.substring (0, index);
        low = value.substring (index);
    }
    String highName = getHighProcessor ().getName (high);
    String lowName = getLowProcessor ().getName (low);
    if (! "".equals (highName)) {
        buffer.append (highName);
        buffer.append (SEPARATOR);
        buffer.append (getToken ());
        if (! "".equals (lowName)) {
            buffer.append (SEPARATOR);
        }
    }
    if (! "".equals (lowName)) {
        buffer.append (lowName);
    }
    return buffer.toString ();
}


 public String getName (String value) {
	StringBuilder output = new StringBuilder();
	String high, low;
	int point;
	
	if (value.length() < getPartDivider()) { 
		high = "";
		low = value;
	} else {
		point = value.length() - getPartDivider();
		high = value.substring(0, point);
		low = value.substring(point);
	}
	
	String highName = getHighProcessor().getName(high);
	String lowName = getLowProcessor().getName(low);
	
	if (!highName.isEmpty()) { 
		output.append(highName);
		output.append(SEPARATOR);
		output.append(getToken());
		
		if (!lowName.isEmpty()) {
			output.append(SEPARATOR);
		}
    }
    
	if (!lowName.isEmpty()) {
		output.append(lowName);
	}
	
	return output.toString();
}
