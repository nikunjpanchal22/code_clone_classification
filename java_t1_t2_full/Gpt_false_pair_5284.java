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


public static String camelCaser (String sequence) {
    String [] items = sequence.split ("_");
    String res = "";
    for (String item : items) {
        if (! item.isEmpty ()) {
            res += Character.toUpperCase (item.charAt (0));
            if (item.length () > 1) {
                res += item.substring(1);
            }
        }
    }
    return res;
}
