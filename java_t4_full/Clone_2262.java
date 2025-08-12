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
        StringBuilder sb  = new StringBuilder ();
        sb.append ("(");

        for (int i = 0; i < myString.length; i++)
        {
            if (i > 0) {
                sb.append (delimiter);
            }
            sb.append (myString[i]);
        }

        sb.append (")");
        System.out.println (sb);
}


