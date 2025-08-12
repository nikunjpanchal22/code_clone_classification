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
   StringBuilder buffer = new StringBuilder ();
   String high, low;
   int partDivider = getPartDivider ();
   if (value.length () >= partDivider) {
      int index = value.length () - partDivider;
      high = value.substring (0, index);
      low = value.substring (index);
   } else {
      high = "";
      low = value;
   }
   String highName = getHighProcessor ().getName (high);
   String lowName = getLowProcessor ().getName (low);
   if (highName.length () > 0) {
      buffer.append (highName);
      buffer.append (SEPARATOR);
      buffer.append (getToken ());
      if (lowName.length () > 0) {
         buffer.append (SEPARATOR);
      }
   }
   if (lowName.length () > 0) {
      buffer.append (lowName);
   }
   return buffer.toString ();
}


