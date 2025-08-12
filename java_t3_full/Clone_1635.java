public static void printTable (String [] countries, int [] populations) {
    if (countries.length != 0) {
        int longestNameInput = countries [0].length ();
        int longestPopInput = String.valueOf (populations [0]).length ();
        for (int i = 0;
        i < countries.length; i ++) {
            int countLength = countries [i].length ();
            int popLength = String.valueOf (populations [i]).length ();
            if (countLength > longestNameInput) longestNameInput = countLength;
            if (popLength > longestPopInput) longestPopInput = popLength;
        }
        for (int i = 0;
        i < countries.length; i ++) {
            System.out.print (countries [i]);
            for (int j = 0;
            j < (longestNameInput - countries [i].length ()); j ++) System.out.print (" ");
            System.out.print (" | ");
            for (int k = 0;
            k < (longestPopInput - String.valueOf (populations [i]).length ()); k ++) System.out.print (" ");
            System.out.println (populations [i]);
        }
    }
}


 public static void printTable (String [] countries, int [] populations) {if (countries.length > 0) {
        int longestNameInput = countries [0].length ();
        int longestPopInput = String.valueOf (populations [0]).length ();
        //for the length of the input array, find the longest value
        for (int i = 0; i < countries.length; i++) {
            //for the current country's name, save its length
            int currentNameLength = countries[i].length();
            //for the current population, save its length
            int currentPopLength = String.valueOf(populations[i]).length();
            //if the current name is longer than the longest recorded one, reassign the longest name length variable
            longestNameInput = (longestNameInput < currentNameLength) ? currentNameLength : longestNameInput;
            //if the current population is larger than the longest recorded one, reassign the longest population length variable
            longestPopInput = (longestPopInput < currentPopLength) ? currentPopLength : longestPopInput;
        }
        //for the length of the input array, print the values
        for (int i = 0; i < countries.length; i++) {
            System.out.print(String.format("%-" + longestNameInput + "s", countries[i]));
            System.out.print(" | ");
            System.out.println(String.format("%" + longestPopInput + "s", populations[i]));
        }
    }
}


