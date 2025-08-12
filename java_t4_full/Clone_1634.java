private static void removeEven (int [] k, int n) {
    int counter = 0;
    for (int i = 0;
    i < n; i ++) if (k [i] % 2 == 1) k [counter ++] = k [i];
    for (int i = counter;
    i < n; i ++) k [i] = 0;
}


  private static void removeEven (int [] k, int n) {
    int counter = 0;
    for (int i = n - 1; i >= 0; i--) 
        if (k[i]%2 != 0) {
            k[counter] = k[i];
            counter++;
        }
    for(int j = counter; j < n; j++) 
        k[j] = 0;
}


