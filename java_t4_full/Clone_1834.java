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
    int minLen = strings[0].length(); 
    for (int i = 0; i < strings.length - 1; i++){
        minLen = Math.min(minLen, strings[i+1].length());
    }
    for (int i = 0; i < minLen; i++){
        for (int j = 0; j < strings.length ; j++){ 
            output += strings[j].charAt(i);
        }
    }
    return output;
}


