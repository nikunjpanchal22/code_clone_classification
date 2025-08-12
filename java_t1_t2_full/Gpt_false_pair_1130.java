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
   StringBuilder output = new StringBuilder ();
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
   if (! highName.equalsIgnoreCase ("")) {
       output.append (highName);
       output.append (SEPARATOR);
       output.append (getToken ());
       if (! lowName.equalsIgnoreCase ("")) {
           output.append (SEPARATOR);
       }
   }
   if (! lowName.equalsIgnoreCase ("")) {
       output.append (lowName);
   }
   return output.toString ();
}
