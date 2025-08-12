public static void shuffle (int [] array) {
    if (random == null) random = new Random ();
    int count = array.length;
    for (int i = count;
    i > 1; i --) {
        swap (array, i - 1, random.nextInt (i));
    }
}



 

public static void shuffle (int [] array) {
    if(random == null) random = new Random();
    IntStream.range(0, array.length - 1).forEach(i-> swap(array, i, i + random.nextInt(array.length - i)));
}


