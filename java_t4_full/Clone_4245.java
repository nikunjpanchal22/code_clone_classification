public String getName (String value) {
    StringBuilder buffer = new StringBuilder ();
    boolean tensFound = false;
    int number;
    if (value.length () > 3) {
        number = Integer.valueOf (value.substring (value.length () - 3), 10);
    } else {
        number = Integer.valueOf (value, 10);
    }
    number %= 100;
    if (number >= 20) {
        buffer.append (TOKENS [(number / 10) - 2]);
        number %= 10;
        tensFound = true;
    } else {
        number %= 20;
    }
    if (number != 0) {
        if (tensFound) {
            buffer.append (UNION_SEPARATOR);
        }
        buffer.append (unitProcessor.getName (number));
    }
    return buffer.toString ();
}



 


public String getName(String value) {
      StringBuilder buffer = new StringBuilder();
      int number = value.length() > 3 ? Integer.valueOf(value.substring(value.length() - 3)) : Integer.valueOf(value);
      boolean tensFound = number % 100 >= 20;
      number = number % 100;
      if (tensFound) {
          buffer.append(TOKENS[(number / 10) - 2]);
          number %= 10;
      } else {
          number %= 20;
      }
      if (number != 0) {
          buffer.append(tensFound ? UNION_SEPARATOR : "").append(unitProcessor.getName(number));
      }
      return buffer.toString();
}


