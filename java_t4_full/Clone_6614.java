public static String translateToEnglish (String phrase) {
    if (phrase == null) {
        return null;
    }
    String finished = phrase.replace ('4', 'a').replace ('1', 'l').replace ('2', 'z').replace ('5', 's').replace ('8', 'b').replace ('0', 'o').replace ('7', 't').replace ("|_|", "u").replace ("3", "e");
    finished = finished.replace (" e ", " 3 ");
    if (finished.startsWith ("e ")) {
        finished = "3 " + finished.substring (2);
    }
    if (finished.endsWith (" e")) {
        finished = finished.substring (0, finished.length () - 2) + " 3";
    }
    return finished;
}




public static String translateToEnglish(String phrase) {
    StringBuilder sb = new StringBuilder(phrase);
    for (int i = 0; i<sb.length(); i++) {
        char ch = sb.charAt(i);
        switch (ch) {
            case '4': sb.setCharAt(i,'a'); break;
            case '1': sb.setCharAt(i,'l'); break;
            case '2': sb.setCharAt(i,'z'); break;
            case '5': sb.setCharAt(i,'s'); break;
            case '8': sb.setCharAt(i,'b'); break;
            case '0': sb.setCharAt(i,'o'); break;
            case '7': sb.setCharAt(i,'t'); break;
            case '3': sb.setCharAt(i,'e'); break;
        }
    }
    String result = sb.toString().replace("|_|", "u");
    return result.replace(" e ", " 3 ");
}


