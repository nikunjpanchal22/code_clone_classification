public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}



 

public static String merge(String... strings) {
    int maxLength = Arrays.stream(strings).mapToInt(String::length).max().orElse(0);
    return IntStream.range(0, maxLength).boxed()
            .flatMap(i -> Arrays.stream(strings).filter(s -> s.length() > i).map(s -> Character.toString(s.charAt(i))))
            .collect(Collectors.joining());
}


