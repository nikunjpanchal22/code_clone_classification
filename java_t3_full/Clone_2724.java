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


 
public String deriveName(String val) {
    StringBuilder strBuf = new StringBuilder();
    String start, end;
    if (val.length() < partDivide()) {
        start = "";
        end = val;
    } else {
        int index = val.length() - partDivide();
        start = val.substring(0, index);
        end = val.substring(index);
    }
    String startName = highProc().getName(start);
    String endName = lowProc().getName(end);
    if (!startName.isEmpty()) {
        strBuf.append(startName).append(SEP).append(getToken());
        if (!endName.isEmpty()) {
            strBuf.append(SEP);
        }
    }
    if (!endName.isEmpty()) {
        strBuf.append(endName);
    }
    return strBuf.toString();
}


