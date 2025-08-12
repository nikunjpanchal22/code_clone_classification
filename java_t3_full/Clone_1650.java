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
    int maxCountryLength = Stream.of(countries).map(String::length).max(Integer::compareTo).orElse(defaultLength);
    int maxPopulationLength = Stream.of(populations).mapToObj(Integer::toString).map(String::length).max(Integer::compareTo).orElse(defaultLength);
    for (int i = 0; i < countries.length; i++) {
        System.out.format("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries[i], populations[i]);
    }
}


