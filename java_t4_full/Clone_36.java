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
    String result = "";
    String[] words = str.split("_");
    for (int i=0; i<words.length; i++) {
        if (words[i].length() > 0) {
            result += Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
        }
    }
    return result;
}


