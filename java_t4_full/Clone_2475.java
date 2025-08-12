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
    String[] arr = input.split("_");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = arr[i].substring(0,1).toUpperCase() + arr[i].substring(1);
    }
    return String.join("", arr);
}


