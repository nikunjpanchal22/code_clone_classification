public static String camelCaser (String str) {
    String [] words = str.split ("_");
    String res = "";
    for (String word : words) {
        if (! word.isEmpty ()) {
            res += Character.toUpperCase (word.charAt (0));
            if (word.length () > 1) {
                res += word.substring (1);
            }
        }
    }
    return res;
}


 public static String camelCaser (String str) {
    str = str.toLowerCase();
    String [] words = str.split ("_");
    String res = "";
    for (int i = 0; i<words.length; i++) {
        String word = words [i];
        if (! word.equals("")) {
            String capitalized = word.substring(0,1).toUpperCase();
            res += capitalized + word.substring(1);
        }
    }
    return res;
}


