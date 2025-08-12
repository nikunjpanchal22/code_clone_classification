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

    StringBuilder result = new StringBuilder();
    Arrays.stream(s.split("#")).forEach(string -> {
        int charIndex = (s.length() > 2 ? 2 : 0);
        int charValue = Integer.parseInt(string.substring(0, charIndex)) + 96;
        result.append((char) charValue);
        if(charIndex < string.length()){
            int remainder = Integer.parseInt(string.substring(charIndex));
            result.append((char) (remainder + 1 + 96));
        }
    });

    return result.toString();
}


