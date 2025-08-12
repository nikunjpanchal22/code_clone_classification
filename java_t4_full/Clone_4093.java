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
    Random rnd = ThreadLocalRandom.current();
    for (int i = a.length; i > 0; i--) {
        int index = rnd.nextInt(i);
        Object temp = a[index];
        a[index] = a[i - 1];
        a[i - 1] = temp;
    }
}


