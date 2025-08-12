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
        String sep = " AND ";
        String result = "( ";
        for (String str : myString)
            result+= str + sep;

        result = result.substring(0, result.length()-5);
        result += " )";
        System.out.println(result);
}


