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
   StringBuilder buffer = new StringBuilder();
   String high, low;
   int divider = getPartDivider();
   if(value.length() < divider) {
      high = "";
      low = value;
   } else {
      int index = value.length() - divider;
      high = value.substring(index);
      low = value.substring(0, index);
   }
   
   String highName = getHighProcessor().getName(high);
   String lowName = getLowProcessor().getName(low);
   
   // Check if highName string isn't empty
   if (!highName.equals("")) {
      buffer.append(highName).append(SEPARATOR).append(getToken());
      // Check if lowName string isn't empty
      if (!lowName.equals("")) {
         buffer.append(SEPARATOR);
      }
   }
   if (!lowName.equals("")) {
      buffer.append(lowName);
   }
   return buffer.toString();
}


