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
    int n = array.length;
    for (int i = 0; i < n; i++) {
        int random = i + (int) (Math.random() * (n-i));
        int temp = array[random];
        array[random] = array[i];
        array[i] = temp;
    }
}


