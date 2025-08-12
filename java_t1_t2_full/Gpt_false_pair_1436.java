public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    int a [] [] = new int [n] [n];
    for (int a_i = 0;
    a_i < n; a_i ++) {
        for (int a_j = 0;
        a_j < n; a_j ++) {
            a [a_i] [a_j] = in.nextInt ();
        }
    }
    int l_sum = 0;
    for (int i = 0;
    i < n; i ++) {
        l_sum += a [i] [i];
    }
    int r_sum = 0;
    for (int j = 0;
    j < n; j ++) {
        r_sum += a [j] [n - 1 - j];
    }
    int sum = l_sum + r_sum;
    System.out.println (sum);
}


 public static void main (String [] args) {Scanner scan1 = new Scanner (System.in); 
    int length = scan1.nextInt ();
    int arr [][] = new int [length] [length]; 
    for (int n = 0; n < length; n ++) {
        for (int m = 0; m < length; m ++) {
            arr [n][m] = scan1.nextInt ();
        }
    }
    int lsum1 = 0;
    for (int i = 0; i < length; i ++) {
        lsum1 += arr [i][i];
    }
    int rsum1 = 0;
    for (int j = 0; j < length; j ++) {
        rsum1 += arr [j][length - 1 - j];
    }
    int subtotal = lsum1 + rsum1;
    System.out.println (subtotal);
}
