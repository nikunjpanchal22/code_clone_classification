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
    int length = array.length, swapIndex, temp;
    for (int i = length - 1; i > 0; i--) {
        swapIndex = random.nextInt(i + 1);
        temp = array[swapIndex];
        array[swapIndex] = array[i];
        array[i] = temp;
    }
}


