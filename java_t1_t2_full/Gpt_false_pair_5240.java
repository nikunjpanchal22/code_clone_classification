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
    StringBuilder buffer = new StringBuilder ();
    String upper, lower;
    if (value.length () < getPartDivider ()) {
        upper = "";
        lower = value;
    } else {
        int pos = value.length () - getPartDivider ();
        upper = value.substring (0, pos);
        lower = value.substring (pos);
    }
    String upperName = getHighProcessor ().getName (upper);
    String lowerName = getLowProcessor ().getName (lower);
    if (! upperName.isEmpty ()) {
        buffer.append (upperName);
        buffer.append (SEPARATOR);
        buffer.append (getToken ());
        if (! lowerName.isEmpty ()) {
            buffer.append (SEPARATOR);
        }
    }
    if (! lowerName.isEmpty ()) {
        buffer.append (lowerName);
    }
    return buffer.toString ();
}
