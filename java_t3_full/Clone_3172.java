public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}



 

public static String merge(String...strings) {
    int maxLength = 0;
    for (String s : strings) maxLength = Math.max(maxLength, s.length());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < maxLength; i ++) {
        Arrays.stream(strings).filter(s -> s.length() > i)
                .forEach(s -> sb.append(s.charAt(i)));
    }
    return sb.toString();
}


