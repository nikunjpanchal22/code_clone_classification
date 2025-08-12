public static void shuffle (int [] array) {
    if (random == null) random = new Random ();
    int count = array.length;
    for (int i = count;
    i > 1; i --) {
        swap (array, i - 1, random.nextInt (i));
    }
}


public static void shuffle (int [] array) {
    if (random == null) random = new SecureRandom();
    int count = array.length;
    for (int i = count;
    i > 1; i --) {
        swap (array, i - 1, random.nextInt (i));
    }
}
