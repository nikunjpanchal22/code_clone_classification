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
    ThreadLocalRandom random = ThreadLocalRandom.current();
    for (int i = 0; i < array.length; i++) {
        int randomIndex = random.nextInt(i + 1);
        int temp = array[i];
        array[i] = array[randomIndex];
        array[randomIndex] = temp;
    }
}


