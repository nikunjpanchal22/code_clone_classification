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
   String [] segments = str.split ("_");
   String results = "";
   for (String seg : segments) {
       if (!"".equals (seg)) {
           results += Character.toUpperCase (seg.charAt (0));
           if (seg.length () > 1) {
               results += seg.substring (1);
           }
       }
   }
   return results;
}
