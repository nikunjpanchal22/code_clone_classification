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
    //Declare and intialize the array
    String [] [] arr = new String [7] [];
    arr [0] = new String [] {"continents","Asia","Europe","Africa","Australia","South America","North America"};
    arr [1] = new String [] {"profession","teacher","doctor","lawyer"};
    arr [2] = new String [] {"brand","apple","samsung"};
    arr [3] = new String [] {"name","lisa","peter","sam","jack"};
    arr [4] = new String [] {"profession","engineer","Professor","Dentist","Driver"};
    arr [5] = new String [] {"sex","value","male","female"};
    arr [6] = new String [] {"exp","value","1","2","3","4"};
    //Assign the pointer
    int number = sc.nextInt ();
    String [] tempReference = arr [number - 1];
    //Shift the index from the given index
    for (int index=number-1; index<arr.length-1; index++) {
        arr[index] = arr [index+1];
    }
    //Fill the reference index of the array details
    arr [arr.length - 1] = tempReference;
    //for loop to traverse through the array
    for (String [] tempArray : arr) {
        for (String s : tempArray) {
            System.out.print (s + " ");
        }
        System.out.println ();
    }
}
