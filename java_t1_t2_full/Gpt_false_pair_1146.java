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
    StringBuilder names = new StringBuilder();
    String top, bottom;
    if (value.length() < getPartDivider()) {
        top = "";
        bottom = value;
    } else {
        int index = value.length() - getPartDivider();
        top = value.substring(0, index);
        bottom = value.substring(index);
    }
    String highName = getHighProcessor().getName(top);
    String lowName = getLowProcessor().getName(bottom);
    if (!highName.equals("")) {
        names.append(highName);
        names.append(SEPARATOR);
        names.append(getToken());
        if (!lowName.equals("")) {
            names.append(SEPARATOR);
        }
    }
    if (!lowName.equals("")) {
        names.append(lowName);
    }
    return names.toString();
}
