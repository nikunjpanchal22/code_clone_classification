public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}


  public static String merge (String...strings) {
    StringBuilder sb = new StringBuilder ();
    int maxSize = 0;
    //find the maximum length string
    for (String s : strings) 
        maxSize = Math.max(maxSize, s.length());
    //add characters to the string builder for each string in the array
    for (int i = 0; i < maxSize; i++)
        for(String s: strings)          
            if(i < s.length())
                sb.append(s.charAt(i));
    return sb.toString();
}


