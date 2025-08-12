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


 public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    int a [][] = new int [n][n];
    for (int row = 0; row < n; row ++) {
        for (int col = 0; col < n; col ++) {
            a [row][col] = in.nextInt ();
        }
    }
    int l_sum = 0;
    int right_index = 0;
    while (right_index < n) {
        l_sum += a [right_index] [right_index] ;
        right_index++;
    }
    int r_sum = 0;
    int left_index = n - 1;
    while (left_index >= 0) {
        r_sum += a [n - 1 - left_index] [left_index] ;
        left_index--;
    }
    int sum = l_sum + r_sum;
    System.out.println (sum);
}


