public void addString (String myString) {
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


  public void addString (String myString) {
        String delim = " AND ";
        StringBuilder sb = new StringBuilder();
        sb.append("(");

        Arrays.asList(myString).forEach(str -> sb.append(str + delim));
        sb.delete(sb.length()-delim.length(), sb.length());
        sb.append(")");

        System.out.println(sb);
}


