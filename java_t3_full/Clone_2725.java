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


 
public String renderName(String value) {
    StringBuilder resultBuilder = new StringBuilder();
    String head, tail;
    if (value.length() < findMidPoint()) {
        head = "";
        tail = value;
    } else {
        int idx = value.length() - findMidPoint();
        head = value.substring(0, idx);
        tail = value.substring(idx);
    }
    String headName = headProcessor().getName(head);
    String tailName = tailProcessor().getName(tail);
    if (!headName.isEmpty()) {
        resultBuilder.append(headName).append(SEPARATOR).append(getToken());
        if (!tailName.isEmpty()) {
            resultBuilder.append(SEPARATOR);
        }
    }
    if (!tailName.isEmpty()) {
        resultBuilder.append(tailName);
    }
    return resultBuilder.toString();
}


