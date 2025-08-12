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
            int index = value.length () - getPartDivider ();
            String high = index > 0 ? value.substring (0, index) : "";
            String low = value.substring (index);
            return concatenateNames(high, low);
        }

        private String concatenateNames(String high, String low) {
            String highName = getHighProcessor ().getName (high);
            String lowName = getLowProcessor ().getName (low);
            String result = "";
            if (! highName.isEmpty ()) result += highName + SEPARATOR + getToken() + (lowName.isEmpty () ? "" : SEPARATOR);
            if (! lowName.isEmpty ()) result += lowName;
            return result;
}


