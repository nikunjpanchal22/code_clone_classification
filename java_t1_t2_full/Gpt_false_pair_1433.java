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


 public static void main (String [] args) {Scanner scann = new Scanner (System.in); 
    int dimensionality = scann.nextInt ();
    int arrayOne [] [] = new int [dimensionality] [dimensionality]; 
    for (int x = 0; x < dimensionality; x ++) {
        for (int y = 0; y < dimensionality; y ++) {
            arrayOne [x][y] = scann.nextInt ();
        }
    }
    int leftToRightTotal = 0;
    for (int a = 0; a < dimensionality; a ++) {
        leftToRightTotal += arrayOne [a][a];
    }
    int rightToLeftTotal = 0;
    for (int b = 0; b < dimensionality; b ++) {
        rightToLeftTotal += arrayOne[ b][dimensionality - 1 - b];
    }
    int endResult = leftToRightTotal + rightToLeftTotal;
    System.out.println (endResult);
}
