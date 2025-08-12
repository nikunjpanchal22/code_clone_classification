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
    StringBuilder name = new StringBuilder ();
    String highString, lowString;
    if (value.length () < getPartDivider ()) {
        highString = "";
        lowString = value;
    } else {
        int index = value.length () - getPartDivider ();
        highString = value.substring (0, index);
        lowString = value.substring (index);
    }
    String highName = getHighProcessor ().getName (highString);
    String lowName = getLowProcessor ().getName (lowString);
    if (highName != "") {
        name.append (highName);
        name.append (SEPARATOR);
        name.append (getToken ());
        if (highName != lowName) {
            name.append (SEPARATOR);
        }
    }
    if (lowName != "") {
        name.append (lowName);
    }
    return name.toString ();
}
