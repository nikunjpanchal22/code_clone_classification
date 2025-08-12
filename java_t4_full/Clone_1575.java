public static void printTable (String [] countries, int [] populations) {
    int defaultLength = 10;
    int maxCountryLength = stream (countries).mapToInt (String :: length).max ().orElse (defaultLength);
    int maxPopulationLength = stream (populations).mapToObj (Integer :: toString).mapToInt (String :: length).max ().orElse (defaultLength);
    for (int i = 0;
    i < countries.length; i ++) {
        System.out.format ("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries [i], populations [i]);
    }
}


  public static void printTable (String [] countries, int [] populations) {
    int defaultLength = 10;
    int maxCountryLength = 0;
    int maxPopulationLength = 0;
    for (int i = 0; i < countries.length; i++) {
        int countryLength = countries[i].length();
        if (maxCountryLength > countryLength)
            maxCountryLength = countryLength;
 
        int populationLength = 0;
        int population = populations[i];
        while (population > 0) {
            population = population/10;
            populationLength++;
        }
 
        if (populationLength > maxPopulationLength)
            maxPopulationLength = populationLength;
 
        for (int j = 0; j < countries.length; j++){
            System.out.format("%-" + maxCountryLength + "s| %" + maxPopulationLength + "d\n", countries[j], populations[j]);
        }
    }
}


