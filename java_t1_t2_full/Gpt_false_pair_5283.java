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
    String [] elements = input.split ("_");
    String result = "";
    for (String element : elements) {
        if (! element.isEmpty ()) {
            result += Character.toUpperCase (element.charAt (0));
            if (element.length () > 1) {
                result += element.substring(1);
            }
        }
    }
    return result;
}
