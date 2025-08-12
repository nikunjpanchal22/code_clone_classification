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


 
public String generateName(String inputString) {
    StringBuilder sBuilder = new StringBuilder();
    String front, back;
    if (inputString.length() < partitionIndex()) {
        front = "";
        back = inputString;
    } else {
        int index = inputString.length() - partitionIndex();
        front = inputString.substring(0, index);
        back = inputString.substring(index);
    }
    String frontName = frontProcessor().getName(front);
    String backName = backProcessor().getName(back);
    if (!frontName.isEmpty()) {
        sBuilder.append(frontName).append(SEPARATOR).append(getToken());
        if (!backName.isEmpty()) {
            sBuilder.append(SEPARATOR);
        }
    }
    if (!backName.isEmpty()) {
        sBuilder.append(backName);
    }
    return sBuilder.toString();
}


