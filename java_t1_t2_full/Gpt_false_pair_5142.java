static void shuffleArray (int [] ar) {
    Random rnd = ThreadLocalRandom.current ();
    for (int i = ar.length - 1;
    i > 0; i --) {
        int index = rnd.nextInt (i + 1);
        int a = ar [index];
        ar [index] = ar [i];
        ar [i] = a;
    }
}


static void shuffleArray (int [] ar) {
    Random rnd = new Random ();
    for (int i = ar.length - 1;
    i > 0; i --) {
        int index = rnd.nextInt (i + 1);
        int a = ar [index];
        ar [index] = ar [i];
        ar [i] = a;
    }
}
