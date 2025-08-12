public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}



 

public static String merge(String... strings) {
    int maxLen = Stream.of(strings).mapToInt(String::length).max().getAsInt();
    StringBuilder res = new StringBuilder();
    for (int i = 0; i < maxLen; ++i) {
        for (String s : strings) {
            if (s.length() > i) {
                res.append(s.charAt(i));
            }
        }
    }
    return res.toString();
}


