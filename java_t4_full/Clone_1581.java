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
    int defaultLength = 10;
    int maxCountryLength = Arrays.stream(countries).map(String::length).max(Integer::compareTo).orElse(defaultLength);
    int maxPopulationLength = Arrays.stream(populations).mapToObj(Integer::toString).map(String::length).max(Integer::compareTo).orElse(defaultLength);
    String format = String.format("%%-%ds | %%%dd\n", maxCountryLength, maxPopulationLength);
    for (int i = 0; i < countries.length; i++) {
        System.out.format(format, countries[i], populations[i]);
    }
}


