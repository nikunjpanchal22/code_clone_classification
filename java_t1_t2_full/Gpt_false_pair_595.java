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
    String [] [] arr = new String [7] [];
    arr [0] = new String [] {"continents","Asia","Europe","Africa","Australia","South America","North America"};
    arr [1] = new String [] {"profession","teacher","doctor","lawyer"};
    arr [2] = new String [] {"brand","apple","samsung"};
    arr [3] = new String [] {"name","lisa","peter","sam","jack"};
    arr [4] = new String [] {"profession","engineer","Professor","Dentist","Driver"};
    arr [5] = new String [] {"sex","value","male","female"};
    arr [6] = new String [] {"exp","value","1","2","3","4"};
    int pos = sc.nextInt ();
    //for loop to create a pointer and shift the index of the array
    String [] tempReference = arr [pos - 1];
    for (int i=pos - 1 ; i < arr.length - 1 ; i++) {
        arr [i] = arr [i + 1];
    }
    //fill the reference index of array details
    arr [arr.length - 1] = tempReference;
    //for loop to traverse through the array
    for (String [] tempArray : arr) {
        for (String s : tempArray) {
            System.out.print (s + " ");
        }
        System.out.println ();
    }
}
