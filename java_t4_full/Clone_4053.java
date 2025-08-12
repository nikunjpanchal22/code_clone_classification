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
    int index, temp;
    for (int i = array.length - 1; i > 0; i--) {
		index = random.nextInt(i + 1);
		temp = array[index];
		array[index] = array[i];
		array[i] = temp;
    }
}


