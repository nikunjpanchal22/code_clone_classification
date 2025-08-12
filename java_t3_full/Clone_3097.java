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
    int maxLengthCountry = java.util.Arrays.stream(countries).mapToInt(country -> country.length()).max().orElse(maxLength);
    int maxLengthPopulation = java.util.Arrays.stream(populations).mapToObj(population -> String.valueOf(population)).mapToInt(population -> population.length()).max().orElse(maxLength);
    for (int i = 0; i < countries.length; i++) {
        System.out.printf("%-" + maxLengthCountry + "s | %" + maxLengthPopulation + "d\n", countries[i], populations[i]);
    }
}


