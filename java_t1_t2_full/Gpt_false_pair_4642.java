public static void main (String [] args) {
    int [] A = {9, 5, 4, 3, 2, 1, 34, 53};
    int [] B = new int [A.length];
    int [] C = new int [A.length];
    int t = 4;
    int countb = 0;
    int countc = 0;
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= t) {
            B [countb ++] = A [i];
        } else {
            C [countc ++] = A [i];
        }
    }
    System.out.println (Arrays.toString (B));
    System.out.println (Arrays.toString (C));
}


public static void main (String [] args) {
    int [] A = {9, 5, 4, 3, 2, 1, 34, 53};
    int [] B = new int [A.length];
    int [] C = new int [A.length];
    int t = 85;
    int countb = 0;
    int countc = 0;
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= t) {
            B [countb ++] = A [i];
        } else {
            C [countc ++] = A [i];
        }
    }
    System.out.println (Arrays.toString (B));
    System.out.println (Arrays.toString (C));
}
