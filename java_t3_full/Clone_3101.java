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
    int max = 10;
    int maxCountry = java.util.Arrays.stream(countries).mapToInt(String::length).max().orElse(max);
    int maxPopulation = Arrays.stream(populations).mapToObj(Integer::toString).mapToInt(String::length).max().orElse(max);
    for (int i = 0; i < countries.length; i++) {
        System.out.printf("%-" + maxCountry + "s | %" + maxPopulation + "d%n", countries[i], populations[i]);
    }
}


