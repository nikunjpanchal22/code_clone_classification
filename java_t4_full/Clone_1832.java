private static String merge (String...strings) {
    StringBuilder sb = new StringBuilder ();
    int adv;
    boolean edited;
    adv = 0;
    edited = true;
    while (edited) {
        edited = false;
        for (String s : strings) {
            if (adv < s.length ()) {
                sb.append (s.charAt (adv));
                edited = true;
            }
        }
        adv ++;
    }
    return sb.toString ();
}


 private static String merge (String...strings) {
    final StringBuilder sb = new StringBuilder();
    int maxLen = 0;
    for (String s : strings) {
        maxLen = Math.max(maxLen, s.length());
    }
    for (int i = 0; i < maxLen; i++) {
        for (String s : strings) {
            if (i < s.length()) {
                sb.append(s.charAt(i));
            }
        }
    }
    return sb.toString();
}


