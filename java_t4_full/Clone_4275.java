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
    int divider = getPartDivider();
    int index = divider > value.length() ? value.length() : value.length() - divider;
    Function<String, String> name = v -> v.isEmpty() ? "" : v.equals(getHighProcessor().getName(v)) ? getHighProcessor().getName(v) + SEPARATOR + getToken() : getLowProcessor().getName(v);
    return name.apply(value.substring(0, index)) +  name.apply(value.substring(index));
}


