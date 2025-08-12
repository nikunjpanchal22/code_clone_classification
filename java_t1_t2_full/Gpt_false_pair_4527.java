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
    StringBuilder sb = new StringBuilder ();
    int step;
    boolean polished;
    step = 0;
    polished = true;
    while (polished) {
        polished = false;
        for (String s : strings) {
            if (step < s.length ()) {
                sb.append (s.charAt (step));
                polished = true;
            }
        }
        step ++;
    }
    return sb.toString ();
}
