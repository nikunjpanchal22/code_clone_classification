public static void shuffle (Object [] a) {
    int n = a.length;
    for (int i = 0;
    i < n; i ++) {
        int r = i + (int) (Math.random () * (n - i));
        Object swap = a [r];
        a [r] = a [i];
        a [i] = swap;
    }
}



 


public static void shuffle(Object[] a) {
    ThreadLocalRandom rand = ThreadLocalRandom.current();
    for (int i = a.length - 1; i > 0; i--) {
        int index = rand.nextInt(i + 1);
        Object tmp = a[index];
        a[index] = a[i];
        a[i] = tmp;
    }
}


