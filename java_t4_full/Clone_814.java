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
    if (! highName.isEmpty ()) {
        buffer.append (highName);
        buffer.append (SEPARATOR);
        buffer.append (getToken ());
        if (! lowName.isEmpty ()) {
            buffer.append (SEPARATOR);
        }
    }
    if (! lowName.isEmpty ()) {
        buffer.append (lowName);
    }
    return buffer.toString ();
}


 public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    int divider = getPartDivider ();
    int totalLength = value.length ();
    if (totalLength >= divider) {
        String highName = getHighProcessor ().getName (value.substring (0, totalLength - divider));
        String lowName = getLowProcessor ().getName (value.substring (totalLength - divider));
        if (!highName.isEmpty ()) {
            buffer.append (highName);
            buffer.append (SEPARATOR);
            buffer.append (getToken ());
            buffer.append (SEPARATOR);
        }
        if (! lowName.isEmpty ()) {
            buffer.append (lowName);
        }
    } else {
        String lowName = getLowProcessor ().getName (value);
        buffer.append (lowName);
    }
    return buffer.toString ();
}


