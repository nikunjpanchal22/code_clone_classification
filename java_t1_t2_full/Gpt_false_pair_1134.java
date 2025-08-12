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
   StringBuilder resultString = new StringBuilder ();
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
   if (! highName.isBlank ()) {
       resultString.append (highName);
       resultString.append (SEPARATOR);
       resultString.append (getToken ());
       if (! lowName.isBlank ()) {
           resultString.append (SEPARATOR);
       }
   }
   if (! lowName.isBlank ()) {
       resultString.append (lowName);
   }
   return resultString.toString ();
}
