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
    IntStream.range(0, array.length).forEach(i -> {
        int random = i + new Random().nextInt(array.length - i);
        int temp = array[i];
        array[i] = array[random];
        array[random] = temp;
    });
}


