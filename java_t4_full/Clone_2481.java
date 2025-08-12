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





public static String camelCaser(String input) {
    return Pattern.compile("_")
     .splitAsStream(input)
     .map(word -> word.substring(0,1).toUpperCase()+word.substring(1))
     .collect(Collectors.joining());
}


