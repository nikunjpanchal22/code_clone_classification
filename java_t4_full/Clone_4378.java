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




public String getName(String value) {
    StringBuilder buffer = new StringBuilder();
    int partDivider = getPartDivider();
    String high = value.length() < partDivider ? "" : value.substring(0, value.length() - partDivider);
    String low =  value.length() < partDivider ? value : value.substring(value.length() - partDivider);

    String highName = getHighProcessor().getName(high);
    String lowName = getLowProcessor().getName(low);

    if (!highName.isEmpty()) buffer.append(highName).append(SEPARATOR).append(getToken()).append(lowName.isEmpty() ? "" : SEPARATOR);
    buffer.append(lowName);
    
    return buffer.toString();;
}


