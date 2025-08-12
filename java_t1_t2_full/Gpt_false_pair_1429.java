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


 public static void main (String [] args) {Scanner read = new Scanner (System.in); 
    int gridSize = read.nextInt ();
    int matrix [][] = new int [gridSize] [gridSize]; 
    for (int row = 0; row < gridSize; row ++) {
        for (int col = 0; col < gridSize; col ++) {
            matrix [row][col] = read.nextInt ();
        }
    }
    int leftToRightDiagSum = 0;
    for (int number1 = 0; number1 < gridSize; number1 ++) {
        leftToRightDiagSum += matrix [number1][number1];
    }
    int rightToLeftDiagSum = 0;
    for (int number2 = 0; number2 < gridSize; number2 ++) {
        rightToLeftDiagSum += matrix [number2][gridSize - 1 - number2];
    }
    int totalSum = leftToRightDiagSum + rightToLeftDiagSum;
    System.out.println (totalSum);
}
