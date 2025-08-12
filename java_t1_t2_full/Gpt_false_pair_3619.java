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


public static void shuffle (Object [] array) {
    int size = array.length;
    for (int i = 0;
    i < size; i ++) {
        int r = i + (int) (Math.random () * (size - i));
        Object temp = array[r];
        array [r] = array [i];
        array [i] = temp;
    }
}
