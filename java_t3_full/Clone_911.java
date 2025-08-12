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
    Random rand = new Random();
    int shuffles = a.length * 2;
    for (int i = 0; i < shuffles; i++) {
        int firstIndex = rand.nextInt(a.length);
        int secondIndex = rand.nextInt(a.length);
        Object temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }
}


