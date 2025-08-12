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



 


public static void shuffle(Object[] a){
    List<Object> list = new ArrayList<>();
    for(Object i : a){
        list.add(i);
    }
    Collections.shuffle(list);
    int i=0;
    for(Object obj : list){
        a[i++] = obj;
    }
}


