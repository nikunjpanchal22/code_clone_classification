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
    int maxCountryLength = stream (countries).mapToInt (x -> x.length()).max ().orElse (defaultLength);
    int maxPopulationLength = 0;
    for(int i = 0; i < countries.length; i++){
        int population = populations[i];
        int populationLength = 0;
        while(population > 0){
            population /= 10;
            populationLength++;
        }
        if(populationLength > maxPopulationLength)
            maxPopulationLength = populationLength;
    }
    for(int i = 0; i < countries.length; i++){
        System.out.format("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries[i], populations[i]);
    }
}


