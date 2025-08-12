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
    final List < Integer > crypt = new ArrayList < > ();
    final String [] groups = s.split ("#");
    for (int i = 0; 
    i < groups.length; i ++) {
        final String group = groups[i];
        int begin = 0;
        if ((i == (groups.length - 1)) && ! s.endsWith ("#")) {
            begin = group.length() - 1;
        } else if (group.length () > 2) {
            begin = group.length () - 2;
        }
        int end = group.length ();
        if (begin == end) {
            end--;
        }
        while (begin >= 0) {
            final int k = (int) group.charAt (begin) - 48;
            crypt.add (k + 1);
            begin--;
        }
        if (begin < group.length ()) {
            crypt.add (Integer.valueOf (group.substring (begin, end)));
        }
    }   
    final StringBuilder n = new StringBuilder (crypt.size ());
    for (final Integer c : crypt) {
        final char d = (char) (('a' + c) - 1);
        n.append (d);
    }
    return n.toString ();
}


