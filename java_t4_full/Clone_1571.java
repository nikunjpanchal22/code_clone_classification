public static void printTable (String [] countries, int [] populations) {
    int defaultLength = 10;
    int maxCountryLength = stream (countries).mapToInt (String :: length).max ().orElse (defaultLength);
    int maxPopulationLength = stream (populations).mapToObj (Integer :: toString).mapToInt (String :: length).max ().orElse (defaultLength);
    for (int i = 0;
    i < countries.length; i ++) {
        System.out.format ("%-" + maxCountryLength + "s | %" + maxPopulationLength + "d\n", countries [i], populations [i]);
    }
}


 public static void printTable(String [] countries, int [] populations) {
    int defaultLength = 10;
    int maxCountryLength= 0;
    int maxPopulationLength = 0;
    
    //find maximum length of country string
    for (int i = 0; i< countries.length; i++) {
        if(maxCountryLength < countries[i].length()) {
            maxCountryLength = countries[i].length(); 
        }
    }
    
    //loop thorugh populations to find the longest number
    for(int i =0; i < populations.length; i++) {
        int number = populations[i]; 
        int numberLength = 0;
        
        //counts number of digits in population 
        while(number > 0) {
            number = number/10;
            numberLength++; 
        }
        if(numberLength > maxPopulationLength) {
            maxPopulationLength = numberLength; 
        }
    }
    //print population 
    for(int i = 0; i< countries.length; i++) {
        System.out.format("%-"+maxCountryLength+"s | %" +maxPopulationLength+"d\n", countries[i], populations[i]); 
    }
}


