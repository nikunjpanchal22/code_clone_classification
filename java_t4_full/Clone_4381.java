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
            String high, low;
            if (value.length() < getPartDivider()) {
                high = "";
                low = value;
            } else {
                high = value.substring(0, value.length() - getPartDivider());
                low = value.substring(value.length() - getPartDivider());
            }
            return formatName(high, low);
        }

        private String formatName(String high, String low){
            StringBuilder buffer = new StringBuilder();
            if (!"".equals(getHighProcessor().getName(high))) {
                buffer.append(getHighProcessor().getName(high)).append(SEPARATOR).append(getToken());
                if (!"".equals(getLowProcessor().getName(low))) buffer.append(SEPARATOR);
            }
            buffer.append(getLowProcessor().getName(low));
            return buffer.toString();
}


