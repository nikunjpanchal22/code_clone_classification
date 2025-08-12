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
    int rows = 15;
    int [] [] tri = new int [rows + 1] [];
    tri [1] = new int [1 + 2];
    tri [1] [1] = 1;
    for (int row = 2;
    row <= rows; row++) {
        tri [row] = new int [row + 2];
        for (int col = 1;
        col < tri [row].length - 1; col++) tri [row] [col] = tri [row - 1] [col - 1] + tri [row - 1] [col];
    }
    for (int row = 1;
    row <= rows; row++) {
        for (int col = 1;
        col < tri [row].length - 1; col++) {
            System.out.print (String.format("%-6s", tri [row] [col]));
        }
        System.out.println ();
    }
}
