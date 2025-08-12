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
    int[] array = {9, 5, 4, 3, 2, 1, 34, 53};
    int target = 4;
    java.util.List<Integer> list1 = new java.util.ArrayList<>();
    java.util.List<Integer> list2 = new java.util.ArrayList<>();
    for (int num : array) {
        if (num <= target) list1.add(num);
        else list2.add(num);
    }
    list1.forEach(e -> System.out.println("B = " + e));
    list2.forEach(e -> System.out.println("C = " + e));
}


