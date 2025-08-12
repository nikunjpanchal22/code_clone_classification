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


public static String camelCaser (String text) {
   String [] parts = text.split ("_");
   String result = "";
   for (String part : parts) {
       if (!"".equals (part)) {
           result += Character.toUpperCase (part.charAt (0));
           if (part.length () > 1) {
               result += part.substring (1);
           }
       }
   }
   return result;
}
