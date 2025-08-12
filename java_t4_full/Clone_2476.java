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



public static String camelCaser (String input) {
    StringBuilder sb = new StringBuilder ();
    for (String word : input.split ("_")){
        sb.append (Character.toUpperCase(word.charAt(0))).append (word.substring(1));
    }
    return sb.toString();
}


