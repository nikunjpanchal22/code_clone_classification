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
    StringBuilder builder = new StringBuilder();
    String hi = "", lo = value;
    if (value.length() >= getPartDivider()) {
        int idx = value.length() - getPartDivider();
        hi = getHighProcessor().getName(value.substring(0, idx));
        lo = getLowProcessor().getName(value.substring(idx));
    }
    if (!hi.isEmpty()) {
        builder.append(hi).append(SEPARATOR).append(getToken());
    }
    if (!lo.isEmpty()) {
        builder.append(lo);
    }
    return builder.toString();
}


