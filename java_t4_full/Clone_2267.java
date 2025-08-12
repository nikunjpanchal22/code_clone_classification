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
        StringJoiner sj = new StringJoiner(" AND ", "(", ")");
        for (String str : myString)
        {
            sj.add(str);
        }
        String str = sj.toString();
        System.out.println(str);
}


