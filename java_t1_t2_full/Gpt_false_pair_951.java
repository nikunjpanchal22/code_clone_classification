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
    int index = value.length () - getPartDivider ();
    String highName, lowName;
    if (value.length () < getPartDivider ()) {
        highName = "";
        lowName = value;
    } else {
        highName = value.substring (0, index);
        lowName = value.substring (index);
    }
    highName = getHighProcessor().getName (highName);
    lowName = getLowProcessor().getName (lowName);
    if (!highName.isEmpty ()) {
        buffer.append (highName);
        buffer.append (SEPARATOR);
        buffer.append (getToken ());
    }
    if (highName.isEmpty() || !lowName.isEmpty()) {
        buffer.append (SEPARATOR);
    }
    if (!lowName.isEmpty ()) {
        buffer.append (lowName);
    }
    return buffer.toString ();
}
