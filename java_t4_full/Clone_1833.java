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
    int arrSize; 
    arrSize = strings.length;
    for (int i = 0; i < strings[0].length(); i++){
        for (int j = 0; j < arrSize ; j++){ 
            if (i < strings[j].length()){
                output += strings[j].charAt(i);
            }
        }
    } 
    return output;
}


