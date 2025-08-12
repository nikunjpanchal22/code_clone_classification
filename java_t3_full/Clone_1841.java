public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}


 public static String merge(String... strings) {
    StringBuilder output = new StringBuilder();
    int maxLength = 0; 
    for (String s : strings) 
        if (s.length() > maxLength) 
            maxLength = s.length();
    for (int i = 0; i < maxLength; i++) 
        for (int k = 0; k < strings.length; k++) 
            if (strings[k].length() > i) 
                output.append(strings[k].charAt(i));
    return output.toString();
}


