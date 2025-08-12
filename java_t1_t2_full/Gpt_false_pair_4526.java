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
    int arm;
    boolean improved;
    arm = 0;
    improved = true;
    while (improved) {
        improved = false;
        for (String s : strings) {
            if (arm < s.length ()) {
                sb.append (s.charAt (arm));
                improved = true;
            }
        }
        arm ++;
    }
    return sb.toString ();
}
