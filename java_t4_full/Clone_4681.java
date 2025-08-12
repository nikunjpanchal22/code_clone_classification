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
    final List < Integer > crypt = new ArrayList < > ();
    final String [] parts = s.split ("#");
    parts.stream().forEach(part -> {
        int indexEnd = part.length() > 2 ? part.length() - 2: (! s.endsWith ("#")) ? part.length() : 0;
        IntStream.range(0, indexEnd).forEach(i -> crypt.add(Integer.valueOf(part.substring(i, i+1))));
        if (indexEnd< part.length ()) {
            crypt.add (Integer.valueOf (part.substring (indexEnd, part.length ())));
        }
    });

    return crypt.stream().map(x -> (char) ('a' + x - 1)).collect(Collectors.joining(""));
}


