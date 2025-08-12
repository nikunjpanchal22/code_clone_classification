public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}



 

public static String merge(String... strings) {
    String longestString = Arrays.sort(strings, Comparator.comparingInt(String::length)).get(0);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < longestString.length(); i++) {
        for (String string : strings) {
            if (i < string.length()) {
                sb.append(string.charAt(i));
            }
        }
    }
    return sb.toString();
}


