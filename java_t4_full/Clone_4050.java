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
    for (int x = 0; x < 100; x++) {
		for (int i = 0; i < array.length; i++) {
			int randomPosition = random.nextInt(array.length);
			int temp = array[i];
			array[i] = array[randomPosition];
			array[randomPosition] = temp;
		}
    }
}


