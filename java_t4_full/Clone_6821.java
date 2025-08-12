public void addString (String...myString) {
    String separator = " AND ";
    StringBuilder sb = new StringBuilder ();
    sb.append ('(');
    boolean needSeparator = false;
    for (String string : myString) {
        if (needSeparator) {
            sb.append (separator);
        } else {
            needSeparator = true;
        }
        sb.append (string);
    }
    sb.append (')');
    System.out.println (sb);
}





public void addString (String...myString) {
    String o = "(";
    for (int i = 0; i< myString.length; i++) {
        o = o + myString[i];
        if (i != myString.length - 1) {
            o = o + " AND ";
        }
    }
    o = o + ")";
    System.out.println (o);
}


