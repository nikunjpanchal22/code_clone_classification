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
    if (myString.length > 0) {
        String str = "(" + myString[0];
        for (int i = 1; i < myString.length; i++) {
            str += " AND " + myString[i];
        }
        str += ')';
        System.out.println (str);
    }
}


