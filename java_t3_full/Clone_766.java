static void shuffleArray (int [] ar) {
    Random rnd = ThreadLocalRandom.current ();
    for (int i = ar.length - 1;
    i > 0; i --) {
        int index = rnd.nextInt (i + 1);
        int a = ar [index];
        ar [index] = ar [i];
        ar [i] = a;
    }
}


 static void shuffleArray (int [] ar)  {
    int n = ar.length;
    for (int i = 0; i < n; i++)  {
        int r = i + (int)(Math.random() * (n-i));  
        int temp = ar[r];
        ar[r] = ar[i];
        ar[i] = temp;
    }
}


