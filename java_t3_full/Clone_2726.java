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



 
public String retrieveName(String data) {
    StringBuffer buff = new StringBuffer();
    String upperPart, lowerPart;
    if (data.length() < partition()) {
        upperPart = "";
        lowerPart = data;
    } else {
        int index = data.length() - partition();
        upperPart = data.substring(0, index);
        lowerPart = data.substring(index);
    }
    String upperName = processUpper().getName(upperPart);
    String lowerName = processLower().getName(lowerPart);
    if (!upperName.isEmpty()) {
        buff.append(upperName).append(DIVIDER).append(getKey());
        if (!lowerName.isEmpty()) {
            buff.append(DIVIDER);
        }
    }
    if (!lowerName.isEmpty()) {
        buff.append(lowerName);
    }
    return buff.toString();
}


