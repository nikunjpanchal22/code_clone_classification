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


public static void shuffleArray(int[] array) {
   int temp;
   for (int i = 0; i < array.length; i++) {
      int randomPosition = (int)(Math.random() * array.length);
      temp = array[i];
      array[i] = array[randomPosition];
      array[randomPosition] = temp;
   } 
}


