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
    String[] arr = s.split("#");
    StringBuilder sb = new StringBuilder();
    for(String group : arr) {
        int pivot = group.length() > 2 ? group.length() - 2 : group.length();
        for(int i = 0; i < pivot; i++) {
            sb.append((char)(Integer.parseInt(group.substring(i, i + 1)) + 96));
        }
        if(pivot < group.length()) {
            sb.append((char)(Integer.parseInt(group.substring(pivot)) + 96));
        }
    }
    return sb.toString();
}


