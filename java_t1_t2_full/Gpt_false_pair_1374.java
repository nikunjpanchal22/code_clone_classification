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


  public static void begin (String [] args) {
    int levels = 15;
    int [] [] pattern = new int [levels + 1] [];
    pattern [1] = new int [1 + 2];
    pattern [1] [1] = 1;
    for (int row = 2;
    row <= levels; row ++) {
        pattern [row] = new int [row + 2];
        for (int col = 1;
        col < pattern [row].length - 1; col++) pattern [row] [col] = pattern [row - 1] [col - 1] + pattern [row - 1] [col];
    }
    for (int row = 1;
    row <= levels; row ++) {
        for (int col = 1;
        col < pattern [row].length - 1; col++) {
            System.out.print (pattern [row] [col] + "\t");
        }
        System.out.println ();
    }
}
