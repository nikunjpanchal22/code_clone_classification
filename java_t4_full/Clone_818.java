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
   String result = "";
   String high = "";
   String low = "";
   int partDivider = getPartDivider();
   
   if (value.length() < partDivider) {
      high = "";
      low = value;
   } else {
      int index = value.length() - partDivider;
      high = value.substring(0, index);
      low = value.substring(index);
   }
   
   String highName = getHighProcessor().getName(high);
   String lowName = getLowProcessor().getName(low);
   
   if (!highName.equals("")) {
      result += highName + SEPARATOR + getToken();
      if (!lowName.equals("")) {
         result += SEPARATOR;
      }
   }
   if (!lowName.equals("")) {
      result += lowName;
   }
   return result;
}


