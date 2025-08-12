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
    SecureRandom rnd = new SecureRandom();
    for (int i = a.length; i > 1; i--) {
        int idx = rnd.nextInt(i);
        Object tmp = a[idx];
        a[idx] = a[i-1];
        a[i-1] = tmp;
    }
}


