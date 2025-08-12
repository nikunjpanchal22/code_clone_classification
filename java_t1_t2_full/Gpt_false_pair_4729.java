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
    Scanner sc = new Scanner (System.in); 
    int length = sc.nextInt (); 
    int leftDiagonalsIndex = 0; 
    int rightDiagonalsIndex = length; 
    int sumLeft = 0; 
    int sumRight = 0; 
    int twoDimensionalArray [][] = new int [length] [length]; 
    for (int i = 0; 
    i < length; i ++) { 
        for (int j = 0; 
        j < length; j ++) { 
            twoDimensionalArray [i] [j] = sc.nextInt (); 
        } 
    } 
    for (int i = 0; 
    i < length; i ++) { 
        boolean leftBoundNotFound = true; 
        boolean rightBoundNotFound = true; 
        rightDiagonalsIndex = -- rightDiagonalsIndex; //subtracting one from right
        for (int j = 0; 
        j < length; j ++) { 
            if (leftDiagonalsIndex == j && leftBoundNotFound) { //checking if left is found
                sumLeft = sumLeft + twoDimensionalArray [i] [j]; 
                leftBoundNotFound = false; 
            } 
            if (rightDiagonalsIndex == j && rightBoundNotFound) { //checking if right is found
                sumRight = sumRight + twoDimensionalArray [i] [j]; 
                rightBoundNotFound = false; 
            } 
        } 
        leftDiagonalsIndex = ++ leftDiagonalsIndex; //adding one to left
    } 
    int difference = sumLeft - sumRight; 
    System.out.println (Math.abs (difference)); 
}
