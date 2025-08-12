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
    int index;
    Object temp;
    Random random = new Random();
    for (int i = a.length - 1; i > 0; i--) {
        index = random.nextInt(i + 1);
        temp = a[index];
        a[index] = a[i];
        a[i] = temp;
    }
}


