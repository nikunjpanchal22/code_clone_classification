public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}



public static String merge(String... strings) {
    final StringBuilder res = new StringBuilder();
    final int maxLen = Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
    IntStream.range(0, maxLen).forEach(i -> Arrays.stream(strings).forEach(s -> {
        if (i < s.length()) res.append(s.charAt(i));
    }));
    return res.toString();
}


