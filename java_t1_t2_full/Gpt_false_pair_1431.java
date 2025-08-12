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


 public static void main (String [] args) {Scanner scan = new Scanner (System.in); 
    int dim = scan.nextInt ();
    int twoDArray [][] = new int [dim] [dim]; 
    for (int x = 0; x < dim; x ++) {
        for (int y = 0; y < dim; y ++) {
            twoDArray [x][y] = scan.nextInt ();
        }
    }
    int sumDiagonalLtoR = 0;
    for (int a = 0; a < dim; a ++) {
        sumDiagonalLtoR += twoDArray [a][a];
    }
    int sumDiagonalRtoL = 0;
    for (int b = 0; b < dim; b ++) {
        sumDiagonalRtoL += twoDArray[ b][dim - 1 - b];
    }
    int result = sumDiagonalLtoR + sumDiagonalRtoL;
    System.out.println (result);
}
