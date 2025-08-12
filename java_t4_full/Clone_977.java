private static String decrypt (final String s) {
    final List < Integer > crypt = new ArrayList < > ();
    final String [] groups = s.split ("#");
    for (int i = 0;
    i < groups.length; i ++) {
        final String group = groups [i];
        int j = 0;
        if ((i == (groups.length - 1)) && ! s.endsWith ("#")) {
            j = group.length ();
        }
        if (group.length () > 2) {
            j = group.length () - 2;
        }
        for (int k = 0;
        k < j; k ++) {
            crypt.add (Integer.valueOf (group.substring (k, k + 1)));
        }
        if (j < group.length ()) {
            crypt.add (Integer.valueOf (group.substring (j, group.length ())));
        }
    }
    final StringBuilder n = new StringBuilder (crypt.size ());
    for (final Integer c : crypt) {
        final char d = (char) (('a' + c) - 1);
        n.append (d);
    }
    return n.toString ();
}


 private static String decrypt(final String s) {
    List<Integer> crypt = new ArrayList<>();
    String[] groups = s.split("#");
    for (int i = 0; i < groups.length; i++) {
        String group = groups[i];
        int maxLength = (i == (groups.length - 1) && !s.endsWith("#") ?  group.length() - 1 : group.length());
        for (int j = 0; j < maxLength; j++) {
            crypt.add(Integer.valueOf(group.substring(j, j + 1)));
         }
        if (maxLength < group.length()) {
            crypt.add(Integer.valueOf(group.substring(maxLength, group.length())));
        }
    }
    StringBuilder n = new StringBuilder(crypt.size());
    for (Integer c : crypt) {
        n.append((char)(('a' + c) - 1));
    }
    return n.toString();
}


