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





public String getName(String value){
        String first, second;
        if (value.length()<getDivider()){
        first = "";
        second = value;
        }
        else{
        int point = value.length()-getDivider();
        first = value.substring(0, point);
        second = value.substring(point);
        }
        String firstName = getHighProcessor().getName(first);
        String secondName = getLowProcessor().getName(second);
        return appendName(firstName, secondName);
}


