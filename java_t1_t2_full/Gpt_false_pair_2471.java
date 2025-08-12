public static void main (String [] args) throws Exception {
    int [] [] matrix = new int [3] [];
    matrix [0] = new int [] {1, 2, 2};
    matrix [1] = new int [] {2, 2, 3};
    matrix [2] = new int [] {0, 1, 2};
    int resultL2R = 1;
    int resultR2L = 1;
    for (int i = 0;
    i < matrix.length; i ++) {
        resultL2R *= matrix [i] [i];
        resultR2L *= matrix [i] [matrix.length - 1 - i];
    }
    System.out.println ("left-to-right: " + resultL2R);
    System.out.println ("right-to-left: " + resultR2L);
}


 public static void main (String args[]) throws Exception {
    //Create a 2D array with 3 rows
    int [][] matrix = new int [3][];
    //Set values for each row
    matrix[0] = new int[] {1,2,2};
    matrix[1] = new int[] {2,2,3};
    matrix[2] = new int[] {0,1,2};

    //Declare variables for results going left-to-right and right-to-left
    int resultL2R = 1;
    int resultR2L = 1;

    //Iterate through the matrix and multiply the corresponding diagonal elements
    for (int i = 0; i < matrix.length; i++) {
        resultL2R *= matrix[i][i];
        resultR2L *= matrix[i][matrix.length - 1 - i ];
    }
    //Print the results
    System.out.println ("left-to-right : " + resultL2R);
    System.out.println ("right-to-left: " + resultR2L);
}
