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
    int maxLength = 10;
    int maxLengthCountry = IntStream.range(0, countries.length).map(i -> countries[i].length()).max().orElse(maxLength);
    int maxLengthPopulation = IntStream.range(0, populations.length).map(i -> Integer.toString(populations[i]).length()).max().orElse(maxLength);
    for (int i = 0; i < countries.length; i++) {
        System.out.printf("%-" + maxLengthCountry + "s | %" + maxLengthPopulation + "d\n", countries[i], populations[i]);
    }
}


