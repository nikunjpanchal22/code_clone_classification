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
    java.util.List<String> countryList = java.util.Arrays.asList(countries);
    int maxLength = 10;
    int maxLengthCountry = countryList.stream().mapToInt(String::length).max().orElse(maxLength);
    int maxLengthPopulation = countryList.stream().map(c -> populations[countryList.indexOf(c)]).mapToInt(Integer::toString).map(String::length).max().orElse(maxLength);
    for (int i = 0; i < countries.length; i++) {
        System.out.printf("%-" + maxLengthCountry + "s | %" + maxLengthPopulation + "d\n", countries[i], populations[i]);
    }
}


