public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}


  public static String merge(String... strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder();
    // find the max length string
    for (String s : strings)
        maxLength = Math.max(maxLength, s.length());
    // iterate through each string and append the characters to the string builder
    for (int i = 0; i < maxLength; i++)
        for (String s : strings)
            if (i < s.length())
                sb.append(s.charAt(i));
    return sb.toString();
}


