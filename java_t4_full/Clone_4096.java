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
    List<Object> list = new ArrayList<>(Arrays.asList(a));
    Collections.shuffle(list, new SecureRandom());
    System.arraycopy(list.toArray(), 0, a, 0, a.length);
}


