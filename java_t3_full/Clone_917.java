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
    for (int i = 0; i < a.length; i++) {
        Object temp = a[i];
        int randomIndex = (int)(Math.random() * a.length);
        a[i] = a[randomIndex];
        a[randomIndex] = temp;
    }
}


