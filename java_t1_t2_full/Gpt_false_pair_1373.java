public static void main (String [] args) {
    int n = 15;
    int [] [] pascal = new int [n + 1] [];
    pascal [1] = new int [1 + 2];
    pascal [1] [1] = 1;
    for (int i = 2;
    i <= n; i ++) {
        pascal [i] = new int [i + 2];
        for (int j = 1;
        j < pascal [i].length - 1; j ++) pascal [i] [j] = pascal [i - 1] [j - 1] + pascal [i - 1] [j];
    }
    for (int i = 1;
    i <= n; i ++) {
        for (int j = 1;
        j < pascal [i].length - 1; j ++) {
            System.out.print (pascal [i] [j] + " ");
        }
        System.out.println ();
    }
}


  public static void main (String [] args) {
    int n = 15;
    int [] [] PascalTriangle = new int [n + 1] [];
    PascalTriangle [1] = new int [1 + 2];
    PascalTriangle [1] [1] = 1;
    for (int row = 2;
    row <= n; row++) {
        PascalTriangle [row] = new int [row + 2];
        for (int col = 1;
        col < PascalTriangle [row].length - 1; col++) PascalTriangle [row] [col] = PascalTriangle [row - 1] [col - 1] + PascalTriangle [row - 1] [col];
    }
    for (int row = 1;
    row <= n; row++) {
        for (int col = 1;
        col < PascalTriangle [row].length - 1; col++) {
            System.out.print (PascalTriangle [row] [col] + "\t");
        }
        System.out.println ();
    }
}
