public static String merge (String...strings) {
    int maxLength = 0;
    StringBuilder sb = new StringBuilder ();
    for (String s : strings) if (s.length () > maxLength) maxLength = s.length ();
    for (int i = 0;
    i < maxLength; i ++) for (String s : strings) if (s.length () > i) sb.append (s.charAt (i));
    return sb.toString ();
}



 

public static String merge(String... strings) {
    return IntStream.range(0, Arrays.stream(strings).mapToInt(String::length).max().orElse(0))
            .mapToObj(i -> Arrays.stream(strings).filter(s -> i < s.length()).map(s -> s.charAt(i)))
            .flatMap(Stream::of)
            .map(Objects::toString)
            .collect(Collectors.joining());
}


