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
    Scanner scanner = new Scanner (System.in);
    int num = scanner.nextInt ();
    int matrix[][] = new int[num][num];
    int sum1 = 0, sum2 = 0;
    for (int i = 0; i < num; i ++) {
        for (int j = 0; j < num; j ++)
            matrix[i][j] = scanner.nextInt ();
        sum1 += matrix[i][i];
        sum2 += matrix[i][matrix.length - 1 - i];
    }
    System.out.println (sum1 + sum2);
}


