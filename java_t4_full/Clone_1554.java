public static void printTable (String [] countries, int [] populations) {
    if (countries.length == 0 || populations.length == 0 || countries.length != populations.length) {
        return;
    }
    int longestCountry = Arrays.stream (countries).map (String :: toString).mapToInt (String :: length).max ().getAsInt ();
    int longestPop = Arrays.stream (populations).mapToObj (Integer :: toString).mapToInt (String :: length).max ().getAsInt ();
    for (int i = 0;
    i < countries.length; i ++) {
        System.out.printf ("%-" + longestCountry + "s | %" + longestPop + "d%n", countries [i], populations [i]);
    }
}


 public static void printTable (String [] countries, int [] populations) {
    if (countries.length == 0 || populations.length == 0 || countries.length != populations.length) {
        return;
    }
    int longestCountry = 0; 
    int longestPop = 0; 
    for(int i = 0; i < countries.length; i++){
        int currentCountryLength = countries[i].length();
        if(currentCountryLength > longestCountry){
            longestCountry = currentCountryLength;
        }
        int currentPopulationLength = Integer.toString(populations[i]).length();
        if(currentPopulationLength > longestPop){
            longestPop = currentPopulationLength;
        }
    }
    for (int i = 0;
    i < countries.length; i ++) {
        System.out.printf ("%-" + longestCountry + "s | %" + longestPop + "d%n", countries [i], populations [i]);
    }
}


