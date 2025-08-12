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
    StringBuilder sb = new StringBuilder();
    int i, j;
    i = 0;
    j = 0;
    while (i < strings.length) {
        while (j < strings[i].length()) {
            sb.append(strings[i].charAt(j));
            ++j;
        }
        ++i;
    } 
    return sb.toString();
}


