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
    String result = "";
    for (String s : input.split("_")) {
      result += s.length() > 1 
                  ? s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase()
                  : s.toUpperCase();
    }
    return result;
}


