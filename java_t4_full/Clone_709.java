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
   IntStream.range(0, array.length)
            .forEach(i -> {
                int randomPosition = (int)(Math.random() * array.length);
                int tmp = array[i];
                array[i] = array[randomPosition];
                array[randomPosition] = tmp;
            });
}


