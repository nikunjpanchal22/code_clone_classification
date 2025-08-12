public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt ();
    int leftStartDiagnol = 0;
    int rightStartDiagnol = n;
    int leftTotal = 0;
    int rightTotal = 0;
    int a [] [] = new int [n] [n];
    for (int a_i = 0;
    a_i < n; a_i ++) {
        for (int a_j = 0;
        a_j < n; a_j ++) {
            a [a_i] [a_j] = in.nextInt ();
        }
    }
    for (int a_i = 0;
    a_i < n; a_i ++) {
        boolean leftNotFound = true;
        boolean rightNotFound = true;
        rightStartDiagnol = -- rightStartDiagnol;
        for (int a_j = 0;
        a_j < n; a_j ++) {
            if (leftStartDiagnol == a_j && leftNotFound) {
                leftTotal = leftTotal + a [a_i] [a_j];
                leftNotFound = false;
            }
            if (rightStartDiagnol == a_j && rightNotFound) {
                rightTotal = rightTotal + a [a_i] [a_j];
                rightNotFound = false;
            }
        }
        leftStartDiagnol = ++ leftStartDiagnol;
    }
    int data = leftTotal - rightTotal;
    System.out.println (Math.abs (data));
}


 public static void main (String [] args) {
    Scanner in = new Scanner (System.in);
    int n = in.nextInt();
    int leftDiagStart = 0;
    int rightDiagStart = n - 1;
    int leftTot = 0;
    int rightTot = 0;
    int arr [][] = new int [n][n];
    for (int row = 0; row < n; row++) {
        for (int col = 0; col < n; col++) {
            arr [row][col] = in.nextInt();
        }
    }
    for (int row = 0; row < n; row++) {
        boolean leftFound = false;
        boolean rightFound = false;
        leftDiagStart++;
        for (int col = 0; col < n; col++) {
            if (leftDiagStart == col && !leftFound) {
                leftTot = leftTot + arr [row][col];
                leftFound = true;
            }
            if (rightDiagStart == col && !rightFound) {
                rightTot = rightTot + arr [row][col];
                rightFound = true;
            }
        }
        rightDiagStart--;
    }
    int diff = leftTot - rightTot;
    System.out.println (Math.abs (diff));
}


