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
    int divider = getPartDivider();
    divider = Math.min(divider, value.length());
    String high = getHighProcessor().getName(value.substring(0, value.length() - divider));
    String low = getLowProcessor().getName(value.substring(value.length() - divider));
    return buffer.append(high).append(SEPARATOR).append(getToken()).append(SEPARATOR).append(low).toString().replaceAll(" +" + SEPARATOR, "");
}


