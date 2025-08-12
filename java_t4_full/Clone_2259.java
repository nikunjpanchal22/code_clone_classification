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
        int i=0;
        String sep = " AND ";
        String addin = "(";
        for (String str : myString)
        {
            if(i>0)
            {
                addin += sep;
            }
            addin+= str;
            i++;
        }
        addin += ")";

        System.out.println(addin);
}


