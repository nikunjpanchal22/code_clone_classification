public static void printTable (String [] countries, int [] populations) {
    int defaultLength = 10;
    int maxCountryLength = stream (countries).mapToInt (String :: length).max ().orElse (defaultLength);
    int maxPopulationLength = stream (populations).mapToObj (Integer :: toString).mapToInt (String :: length).max ().orElse (defaultLength);
    for (int i = 0;
    i < countries.length; i ++) {
        System.out.format ("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries [i], populations [i]);
    }
}


 public static void printTable(String[] countries, int[] populations){
    int maxCountryLength = 0;
    int maxPopLength = 0;
    for(int i = 0; i < countries.length; i++){
        if(maxCountryLength < countries[i].length())
            maxCountryLength = countries[i].length();
    } 

    for(int i = 0; i < populations.length; i++){ 
        int tempPop = populations[i];
        int tempPopLen = 0;
        while(tempPop != 0){
            tempPop = tempPop/10;
            tempPopLen++;
        }
        if(tempPopLen > maxPopLength){
            maxPopLength = tempPopLen;
        }
    }
    for(int i = 0; i< countries.length; i++){
        System.out.format("%-"+maxCountryLength+"s | %"+maxPopLength+"d\n", countries[i], populations[i]);
    }
}


