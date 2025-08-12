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
   for(int i = 0; i < array.length; i++) {
      int randomIndex = (int)(Math.random() * array.length);
      int temp = array[i];
      array[i] = array[randomIndex];
      array[randomIndex] = temp;
   }
}


