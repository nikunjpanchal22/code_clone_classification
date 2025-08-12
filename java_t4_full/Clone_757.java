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
    int n = array.length;
    while (n > 0) {
        int index = rand.nextInt (n);
        n--;
        int temp = array [n];
        array [n] = array [index];
        array [index] = temp;
    }
}


