public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}


 public static String merge (String...strings) {
    int minLength = Integer.MAX_VALUE;
    int maxLength = 0;
    StringBuilder sb = new StringBuilder();
    for (String s : strings) {
        if (s.length() < minLength) {
            minLength = s.length();
        }
        if (s.length() > maxLength) {
            maxLength = s.length();
        }
    }
    for (int i = 0; i < minLength; i++) {
        for (String s : strings) {
            sb.append(s.charAt(i));
        }
    }
    for (int i = minLength; i < maxLength; i++) {
        for (String s : strings) {
            if (s.length() > i) {
                sb.append(s.charAt(i));
            }
        }
    }
    return sb.toString();
}


