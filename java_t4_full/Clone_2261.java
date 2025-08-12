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
        StringBuilder sb = new StringBuilder("(");
        int n = myString.length;
        if (n > 0)
        {
            sb.append(myString[0]);
            for (int i = 1; i < n; i++)
            {
                sb.append(sep);
                sb.append(myString[i]);
            }
        }

        sb.append(")");
        System.out.println(sb);
}


