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
    int length = array.length;
    for (int i = 0; i < length; i++) {
        int swapWith = r.nextInt(length);
        int temp = array[swapWith];
        array[swapWith] = array[i];
        array[i] = temp;
    }
}


