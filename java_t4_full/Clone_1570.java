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
    
    // loop through all countries to find max string length
    for(int i = 0; i < countries.length; i++) {
        if (maxCountryLength < countries[i].length()) {
            maxCountryLength = countries[i].length();
        }
    }
    
    // loop through all populations to find max int length
    for (int j = 0; j < populations.length; j++) {
        int population = populations[j];
        int populationLength = 0;
        
        // finds digits in population
        while (population > 0) {
            population = population/10;
            populationLength++;
        }
        if (populationLength> maxPopulationLength) {
            maxPopulationLength = populationLength;
        }
    }
    // printing
    for (int k = 0; k< countries.length; k++) {
        System.out.format("%-"+maxCountryLength+"s | %" +maxPopulationLength+"d\n", countries[k], populations[k]);
    }
}


