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
        String separator = " AND ";
        StringBuilder sb = new StringBuilder("(");

        List<String> strings = Arrays.asList(myString);
        IntStream
                .range(0, strings.size())
                .forEach(i -> {
                    if (i > 0) {
                        sb.append(separator);
                    }
                    sb.append(myString[i]);
                });

        sb.append(")");
        System.out.println (sb);
}


