public static void shuffle (int [] array) {
    if (random == null) random = new Random ();
    int count = array.length;
    for (int i = count;
    i > 1; i --) {
        swap (array, i - 1, random.nextInt (i));
    }
}



 

public static void shuffle(int[] array) {
    if(random == null) random = new Random();
    for (int i = array.length - 1; i > 0; i--) {
        int swapWith = random.nextInt(i);
        int temp = array[i];
        array[i] = array[swapWith];
        array[swapWith] = temp;
    }
}


