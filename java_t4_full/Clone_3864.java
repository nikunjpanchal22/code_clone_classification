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
    int[] arr = {9, 5, 4, 3, 2, 1, 34, 53};
    int key = 4;
    java.util.PriorityQueue<Integer> heap1 = new java.util.PriorityQueue<>();
    java.util.PriorityQueue<Integer> heap2 = new java.util.PriorityQueue<>();
    for (int num : arr) {
        if (num <= key) heap1.add(num);
        else heap2.add(num);
    }
    heap1.forEach(e -> System.out.println("B = " + e));
    heap2.forEach(e -> System.out.println("C = " + e));
}


