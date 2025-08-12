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

    for(int i=0; i<a.length; i++) {
    	Random rand = new Random();
    	int randomIndex = rand.nextInt(a.length);
    	Object temp = a[randomIndex];
    	a[randomIndex] = a[i];
    	a[i] = temp;
    }
}


