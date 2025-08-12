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
    String output = "";
    int len; 
    len = Math.min(strings[0].length(), strings[1].length());
    for (int i = 0; i < len; i++){
        output += strings[0].charAt(i);
        output += strings[1].charAt(i);
    } 
    return output;
}


