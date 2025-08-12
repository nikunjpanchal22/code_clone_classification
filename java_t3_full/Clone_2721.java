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


 
public String fetchName(String val) {
    StringBuilder sb = new StringBuilder();
    String first, second;
    if (val.length() < divide()) {
        first = "";
        second = val;
    } else {
        int idx = val.length() - divide();
        first = val.substring(0, idx);
        second = val.substring(idx);
    }
    String firstName = getFirst().getName(first);
    String secondName = getSecond().getName(second);
    if (!firstName.equals("")) {
        sb.append(firstName).append(SEP).append(getToken());
        if (!secondName.equals("")) {
            sb.append(SEP);
        }
    }
    if (!secondName.equals("")) {
        sb.append(secondName);
    }
    return sb.toString();
}


