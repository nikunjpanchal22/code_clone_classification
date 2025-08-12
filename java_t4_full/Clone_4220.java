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
    StringBuffer buffer = new StringBuffer();
    int index = value.length() > getPartDivider() ? value.length() - getPartDivider() : 0;
    buffer.append(getHighProcessor().getName(value.substring(0, index)));
    buffer.append(getToken());
    buffer.append(getLowProcessor().getName(value.substring(index)));
    return buffer.toString().replaceAll(" +" + SEPARATOR, "");
}


