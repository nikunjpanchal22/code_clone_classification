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






private static String decrypt (final String s) {
    final LinkedList < Integer > crypt = new LinkedList < > ();
    final String [] parts = s.split ("#");
    for (int i = 0; i < parts.length; i ++) {
        final String item = parts [i];
        int pos = item.length() > 2 ? item.length() - 2: (i == (parts.length - 1) && ! s.endsWith ("#")) ? item.length() : 0;
        for (int k = 0; k < pos; k ++) {
            crypt.add (Integer.valueOf (item.substring (k, k + 1)));
        }
        if (pos < item.length ()) {
            crypt.add (Integer.valueOf (item.substring (pos, item.length ())));
        }
    }
    final StringBuilder sb = new StringBuilder (crypt.size ());
    for (final Integer c : crypt) {
        sb.append (char) (('a' + c) - 1);
    }
    return sb.toString ();
}


