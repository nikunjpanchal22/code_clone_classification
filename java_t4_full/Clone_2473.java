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
    StringTokenizer st = new StringTokenizer(input, "_");
    StringBuilder sb = new StringBuilder();
    while (st.hasMoreTokens()) {
        String lexeme = st.nextToken();
        sb.append(Character.toUpperCase(lexeme.charAt(0)));
        if (lexeme.length() > 1) {
            sb.append(lexeme.substring(1));
        }
    }
    return sb.toString();
}


