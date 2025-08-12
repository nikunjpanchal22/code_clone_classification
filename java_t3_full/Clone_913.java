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


 public static void shuffle (Object [] a) {
    for (int i = 0; i < a.length-1; i++) {
        for (int j = i+1; j < a.length; j++) {
            if (Math.random() < 0.5) {
                Object temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
}


