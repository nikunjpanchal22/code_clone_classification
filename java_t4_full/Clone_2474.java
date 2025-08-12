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
    StringBuilder sb = new StringBuilder();
    String[] words = input.split("_");
    for(String word : words) {
        sb.append(word.substring(0, 1).toUpperCase());
        if(word.length() > 1) {
            sb.append(word.substring(1).toLowerCase());
        }
    }
    return sb.toString();
}


