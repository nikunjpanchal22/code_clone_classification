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


 public String getName (String val) {
    StringBuilder output = new StringBuilder();
    String upper, lower;
    if (val.length() < getPartDivider()) {
        upper = "";
        lower = val;
    } else {
        int pos = val.length() - getPartDivider();
        upper = val.substring(0, pos);
        lower = val.substring(pos);
    }
    String highName = getHighProcessor().getName(upper);
    String lowName = getLowProcessor().getName(lower);
    if (!highName.equals("")) {
        output.append(highName);
        output.append(SEPARATOR);
        output.append(getToken());
        if (!lowName.equals("")) {
            output.append(SEPARATOR);
        }
    }
    if (!lowName.equals("")) {
        output.append(lowName);
    }
    return output.toString ();
}
