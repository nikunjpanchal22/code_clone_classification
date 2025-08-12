public static void main (String [] args) {
    int [] A = {9, 5, 4, 3, 2, 1, 34, 53};
    int t = 4;
    int count = 0;
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= t) {
            count ++;
        }
    }
    int [] B = new int [count];
    int [] C = new int [A.length - count];
    for (int i = 0, j = 0, k = 0;
    i < A.length; i ++) {
        if (A [i] <= t) {
            B [j] = A [i];
            System.out.println ("B = " + B [j]);
            j ++;
        } else {
            C [k] = A [i];
            System.out.println ("C = " + C [k]);
            k ++;
        }
    }
}





public static void main(String[] args) {
    Integer[] arr = {9, 5, 4, 3, 2, 1, 34, 53};
    int tval = 4;
    java.util.Set<Integer> set1 = new java.util.HashSet<>();
    java.util.Set<Integer> set2 = new java.util.HashSet<>();
    for (int i: arr) {
        if (i <= tval) set1.add(i);
        else set2.add(i);
    }
    set1.forEach(e -> System.out.println("B = " + e));
    set2.forEach(e -> System.out.println("C = " + e));
}


