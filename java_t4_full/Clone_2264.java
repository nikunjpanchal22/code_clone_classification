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
        String join = " AND ";
        String result = "";
        for (String str : myString)
        {
            if (result == "")
                result += str;
            else
                result += join + str;
        }

        result = "(" + result + ")";

        System.out.println(result);
}


