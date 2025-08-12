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
	StringBuilder strBuilder = new StringBuilder();
	String high, low;
	int ending;
	
	if (value.length() < getPartDivider()) {
		high = "";
		low = value;
	} else {
		ending = value.length() - getPartDivider();
		high = value.substring(0, ending);
		low = value.substring(ending);
	} 
	
	String highName = getHighProcessor().getName(high);
	String lowName = getLowProcessor().getName(low);
	
	if (!highName.isEmpty()) {
		strBuilder.append(highName);
		strBuilder.append(SEPARATOR);
		strBuilder.append(getToken());
		
		if (!lowName.isEmpty()) {
			strBuilder.append(SEPARATOR);
		}
	}
	
	if (!lowName.isEmpty()) {
		strBuilder.append(lowName);
	}
	
	return strBuilder.toString();
}
