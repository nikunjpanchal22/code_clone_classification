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
    Random rand = new Random();
    for (int i = 0; i < array.length; i++) {
        int randomIndex = rand.nextInt(array.length);
        int temp = array[randomIndex];
        array[randomIndex] = array[i];
        array[i] = temp;
    }
}


