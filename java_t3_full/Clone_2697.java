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
    for (int i = a.length - 1; i >= 0; i--) {
        int j = (int) Math.floor(Math.random() * (i + 1));
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}


