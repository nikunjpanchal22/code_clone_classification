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
    for (int i = array.length -1;
    i > 0; i --) {
        int randIndex = rand.nextInt (i + 1);
        int temp = array [randIndex];
        array [randIndex] = array [i];
        array [i] = temp;
    }
}


