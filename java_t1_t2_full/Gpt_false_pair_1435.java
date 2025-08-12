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


 public static void main (String [] args) {Scanner sc = new Scanner (System.in); 
    int size = sc.nextInt ();
    int matrix [][] = new int [size] [size]; 
    for (int row = 0; row < size; row ++) {
        for (int col = 0; col < size; col ++) {
            matrix [row][col] = sc.nextInt ();
        }
    }
    int leftToRightSum = 0;
    for (int index1 = 0; index1 < size; index1 ++) {
        leftToRightSum += matrix [index1][index1];
    }
    int rightToLeftSum = 0;
    for (int index2 = 0; index2 < size; index2 ++) {
        rightToLeftSum += matrix [index2][size - 1 - index2];
    }
    int result = leftToRightSum + rightToLeftSum;
    System.out.println (result);
}
