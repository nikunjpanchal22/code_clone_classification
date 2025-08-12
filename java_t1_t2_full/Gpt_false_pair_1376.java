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
    int [] [] board = new int [rows + 1] [];
    board [1] = new int [1 + 2];
    board [1] [1] = 1;
    for (int row = 2;
    row <= rows; row++) {
        board [row] = new int [row + 2];
        for (int col = 1;
        col < board [row].length - 1; col++) board [row] [col] = board [row - 1] [col - 1] + board [row - 1] [col];
    }
    for (int row = 1;
    row <= rows; row++) {
        for (int col = 1;
        col < board [row].length - 1; col++) {
            System.out.print (String.format("%5s", board [row] [col]));
        }
        System.out.println ();
    }
}
