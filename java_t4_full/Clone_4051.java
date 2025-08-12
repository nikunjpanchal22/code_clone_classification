public static void shuffle (int [] array) {
    if (random == null) random = new Random ();
    int count = array.length;
    for (int i = count;
    i > 1; i --) {
        swap (array, i - 1, random.nextInt (i));
    }
}



public static void shuffle (int [] array) {
    if(random == null) random = new SecureRandom();
    int n = array.length;
    while (n > 1) {
        int k = random.nextInt(n--);
        int temp = array[k];
        array[k] = array[n];
        array[n] = temp;
    }
}


