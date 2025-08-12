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
    List<String> countryList = Arrays.asList(countries);
    List<Integer> populationList = Arrays.stream(populations).boxed().collect(Collectors.toList());
    IntStream.range(0, countryList.size()).forEach(i -> System.out.println(countryList.get(i) + ":" + populationList.get(i)));
}


