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
   StringBuilder outputText = new StringBuilder ();
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
   if (highName != "") {
       outputText.append (highName);
       outputText.append (SEPARATOR);
       outputText.append (getToken ());
       if (lowName != "") {
           outputText.append (SEPARATOR);
       }
   }
   if (lowName != "") {
       outputText.append (lowName);
   }
   return outputText.toString ();
}
