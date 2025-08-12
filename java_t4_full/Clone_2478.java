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
    return Stream.of(input.split("_"))
            .map(i -> i.substring(0, 1).toUpperCase() + i.substring(1))
            .collect(Collectors.joining());
}


