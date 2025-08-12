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
     int n = a.length;
     for (int i = 0; i < n; i++) { 
        int j = (int) (rand.nextDouble() * (n - i) + i); 
        Object temp = a[i]; 
        a[i] = a[j]; 
        a[j] = temp;
    }
}


