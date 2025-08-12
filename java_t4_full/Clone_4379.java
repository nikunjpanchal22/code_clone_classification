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
            List<String> parts = partition (value);
            String high = parts.get(0);
            String low = parts.get(1);
            if (high.length() > 0 ){
                buffer.append(getHighProcessor ().getName (high));
                buffer.append (SEPARATOR);
                buffer.append (getToken ());
            }
            if (low.length() >0 ){
                if (high.length() > 0) buffer.append (SEPARATOR);
                buffer.append(getLowProcessor ().getName (low));
            }
            return buffer. toString ();
        }
        private List<String> partition(String value){
            String high, low;
            if (value.length() < getPartDivider ()){
                high = "";
                low = value; 
            } else {
                int index = value.length()- getPartDivider ();
                high = value. substring (0, index);
                low = value. substring (index);
            }
            return Arrays.asList(high, low);
}


