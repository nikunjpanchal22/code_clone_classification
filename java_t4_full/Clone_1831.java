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
    char[] out = new char[128];
    int i = 0, j = 0;
    while (i < strings.length) {
        int idx = 0; 
        while (idx < strings[i].length()) {
            out[j++] = strings[i].charAt(idx);
            ++idx;
        }
        ++i;
    } 
    return new String(out).trim();
}


