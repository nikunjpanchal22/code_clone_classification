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
    boolean finished = false;
    int counter = 0;
    while (!finished) {
        finished = true;
        for (int i = 0; i < strings.length; i++) {
            if (counter < strings[i].length()) {
                sb.append(strings[i].charAt(counter));
                finished = false;
            }
        }
            counter++;
    }
    return sb.toString();
}


