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
    for (int i = 0; i < array.length; i++) {
	   int s = i + random.nextInt(array.length - i);
	   int tmp = array[i];
	   array[i] = array[s];
	   array[s] = tmp;
    }
}


