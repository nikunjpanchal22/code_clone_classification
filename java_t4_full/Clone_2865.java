public static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) {
        return false;
    }
    for (int i = 0;
    i < s2.length (); i ++) {
        if (! s1.contains ("" + s2.charAt (i))) {
            return false;
        }
        s1 = s1.replaceFirst ("" + s2.charAt (i), "");
        s2 = s2.replaceFirst ("" + s2.charAt (i), "");
    }
    return true;
}



 


public static boolean isAnagram(String s1, String s2) {
    String sortedS1 = Stream.of(s1.split("")).sorted().collect(Collectors.joining());
    String sortedS2 = Stream.of(s2.split("")).sorted().collect(Collectors.joining());
    return sortedS1.equals(sortedS2);
}


