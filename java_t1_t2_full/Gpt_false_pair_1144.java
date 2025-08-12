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
        StringBuilder result = new StringBuilder ();
        String top, bot;
        if (val.length () < getPartDivider ()) {
            top = "";
            bot = val;
        } else {
            int index = val.length () - getPartDivider ();
            top = val.substring (0, index);
            bot = val.substring (index);
        }
        String highName = getHighProcessor ().getName (top);
        String lowName = getLowProcessor ().getName (bot);
        if (highName != "") {
            result.append (highName);
            result.append (SEPARATOR);
            result.append (getToken ());
            if (lowName != "") {
                result.append (SEPARATOR);
            }
        }
        if (lowName != "") {
            result.append (lowName);
        }
        return result.toString ();
}
