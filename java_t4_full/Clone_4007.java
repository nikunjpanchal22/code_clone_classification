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
    Random r = new Random();
    for (int i = array.length - 1; i > 0; i--) {
        int m = r.nextInt(i + 1);
        int tmp = array[i];
        array[i] = array[m];
        array[m] = tmp;
    }
}


