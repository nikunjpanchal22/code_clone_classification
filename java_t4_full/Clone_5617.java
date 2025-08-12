public static void printTable (String [] countries, int [] populations) {
    int defaultLength = 10;
    int maxCountryLength = stream (countries).mapToInt (String :: length).max ().orElse (defaultLength);
    int maxPopulationLength = stream (populations).mapToObj (Integer :: toString).mapToInt (String :: length).max ().orElse (defaultLength);
    for (int i = 0;
    i < countries.length; i ++) {
        System.out.format ("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries [i], populations [i]);
    }
}





public static void printTable(String[] countries, int[] populations) {
    for(int i = 0, len = countries.length; i < len; ++i) {
        System.out.println(new StringBuilder().append(countries[i]).append(" : ").append(populations[i]));
    }
}


