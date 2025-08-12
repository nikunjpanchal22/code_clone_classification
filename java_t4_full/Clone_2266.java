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
        String delimiter = " AND ";
        String result = "(";
        result = Arrays.stream(myString).collect(Collectors.joining(delimiter));
        result += ")";
        System.out.println(result);
}


