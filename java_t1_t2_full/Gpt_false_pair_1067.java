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
    StringBuilder sb = new StringBuilder();
    String high, low;
    int position;
    
    if (value.length() < getPartDivider()) {
        high = "";
        low = value;
    } else {
        position = value.length() - getPartDivider();
        high = value.substring(0, position);
        low = value.substring(position);
    }
    
    String highName = getHighProcessor().getName(high);
    String lowName = getLowProcessor().getName(low);
    
    if(!highName.isEmpty()) {
        sb.append(highName);
        sb.append(SEPARATOR);
        sb.append(getToken());
        
        if (!lowName.isEmpty()) {
            sb.append(SEPARATOR);
        }
    }
    
    if(!lowName.isEmpty()) {
        sb.append(lowName);
    }
    
    return sb.toString();
}
