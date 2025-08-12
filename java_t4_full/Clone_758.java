public static void shuffleArray (int [] array) {
    List < Integer > list = new ArrayList < > ();
    for (int i : array) {
        list.add (i);
    }
    Collections.shuffle (list);
    for (int i = 0;
    i < list.size (); i ++) {
        array [i] = list.get (i);
    }
}


  public static void shuffleArray (int [] array) {
    Random rand = new Random ();
    for (int i = 0;
    i < array.length; i ++) {
        // Generate two random numbers between 0 & array.length
        int randIndex1 = rand.nextInt (array.length);
        int randIndex2 = rand.nextInt (array.length);
        // Swap the elements of the random positions
        int temp = array [randIndex1];
        array [randIndex1] = array [randIndex2];
        array [randIndex2] = temp;
    }
}


