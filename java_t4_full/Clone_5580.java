public static String interleave (String you, String me) {
    char [] a = you.toCharArray ();
    char [] b = me.toCharArray ();
    StringBuilder out = new StringBuilder ();
    int maxLength = Math.max (a.length, b.length);
    for (int i = 0;
    i < maxLength; i ++) {
        if (i < a.length) out.append (a [i]);
        if (i < b.length) out.append (b [i]);
    }
    return out.toString ();
}




public static String interleave(String you, String me) {
    return IntStream.range(0, Math.max(you.length(), me.length())).boxed()
            .flatMap(i -> Stream.of(i < you.length() ? String.valueOf(you.charAt(i)) : "", i < me.length() ? String.valueOf(me.charAt(i)) : ""))
            .collect(Collectors.joining());
}


