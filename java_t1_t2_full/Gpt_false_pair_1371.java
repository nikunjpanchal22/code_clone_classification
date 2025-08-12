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
    int [] [] pascals = new int [rows + 1] [];
    pascals [1] = new int [1 + 2];
    pascals [1] [1] = 1;
    for (int r = 2;
    r <= rows; r ++) {
        pascals [r] = new int [r + 2];
        for (int col = 1;
        col < pascals [r].length - 1; col++) pascals [r] [col] = pascals [r - 1] [col - 1] + pascals [r - 1] [col];
    }
    for (int r = 1;
    r <= rows; r ++) {
        for (int c = 1;
        c < pascals [r].length - 1; c ++) {
            System.out.print (pascals [r] [c] + " ");
        }
        System.out.println ();
    }
}
