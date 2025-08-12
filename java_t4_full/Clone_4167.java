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





public String getName(String value){
            String high, low;
            int index = value.length() >= getPartDivider() ? value.length() - getPartDivider() : 0;
            high = value.substring(0, index);
            low = value.substring(index);
            return formatStrings(high, low);
        }

        private String formatStrings(String high, String low){
            StringBuilder buffer = new StringBuilder();
            String highName = getHighProcessor().getName(high);
            String lowName = getLowProcessor().getName(low);
            if (!highName.isEmpty()) {
                buffer.append(highName).append(SEPARATOR).append(getToken());
            }
            if (!lowName.isEmpty()){
                if(!highName.isEmpty()) buffer.append(SEPARATOR);
                buffer.append(lowName);
            } 
            return buffer.toString();
}


