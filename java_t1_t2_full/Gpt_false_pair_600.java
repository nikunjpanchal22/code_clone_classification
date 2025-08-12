public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    String [] [] array = new String [7] [];
    array [0] = new String [] {"continents", "Asia", "Europe", "Africa", "Australia", "South America", "North America"};
    array [1] = new String [] {"profession", "teacher", "doctor", "lawyer"};
    array [2] = new String [] {"brand", "apple", "samsung"};
    array [3] = new String [] {"name", "lisa", "peter", "sam", "jack"};
    array [4] = new String [] {"profession", "engineer", "Professor", "Dentist", "Driver"};
    array [5] = new String [] {"sex", "value", "male", "female"};
    array [6] = new String [] {"exp", "value", "1", "2", "3", "4"};
    int index = sc.nextInt ();
    String [] tempReference = array [index - 1];
    for (int i = index - 1;
    i < array.length - 1; i ++) {
        array [i] = array [i + 1];
    }
    array [array.length - 1] = tempReference;
    for (String [] tempArray : array) {
        for (String s : tempArray) {
            System.out.print (s + " ");
        }
        System.out.println ();
    }
}


 public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    //intialize array
    String [] [] array = new String [7] [];
    array [0] = new String [] {"continents","Asia","Europe","Africa","Australia","South America","North America"};
    array [1] = new String [] {"profession","teacher","doctor","lawyer"};
    array [2] = new String [] {"brand","apple","samsung"};
    array [3] = new String [] {"name","lisa","peter","sam","jack"};
    array [4] = new String [] {"profession","engineer","Professor","Dentist","Driver"};
    array [5] = new String [] {"sex","value","male","female"};
    array [6] = new String [] {"exp","value","1","2","3","4"};
    //receive the index from user
    int index = sc.nextInt ();
    //Assign the pointer
    String [] tempReference = array [index - 1];
    //for loop to shift the index from received index
    for (int i=index-1; i<array.length-1; i++) {
        array[i] = array [i+1];
    }
    //fill the reference index details in the array
    array [array.length - 1] = tempReference;
    //for loop to traverse through the array
    for (String [] tempArray : array) {
        for (String s : tempArray) {
            System.out.print (s + " ");
        }
        System.out.println ();
    }
}
