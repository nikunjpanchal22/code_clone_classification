public static void printTable (String [] countries, int [] populations) {
    if (countries.length == 0 || populations.length == 0 || countries.length != populations.length) {
        return;
    }
    int longestCountry = Arrays.stream (countries).map (String :: toString).mapToInt (String :: length).max ().getAsInt ();
    int longestPop = Arrays.stream (populations).mapToObj (Integer :: toString).mapToInt (String :: length).max ().getAsInt ();
    for (int i = 0;
    i < countries.length; i ++) {
        System.out.printf ("%-" + longestCountry + "s | %" + longestPop + "d%n", countries [i], populations [i]);
    }
}





public static void printTable(String[] countries, int[] populations) {
    Map<String, Integer> map = new LinkedHashMap<>();
    for (int i = 0; i < countries.length; i++) {
        map.put(countries[i], populations[i]);
    }
    map.forEach((k, v) -> System.out.println(k + " : " + v));
}


