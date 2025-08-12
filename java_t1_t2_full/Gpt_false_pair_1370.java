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
    int height = 15;
    int [] [] triangle = new int [height + 1] [];
    triangle [1] = new int [1 + 2];
    triangle [1] [1] = 1;
    for (int row = 2;
    row <= height; row++) {
        triangle [row] = new int [row + 2];
        for (int col = 1;
        col < triangle [row].length - 1; col++) triangle [row] [col] = triangle [row - 1] [col - 1] + triangle [row - 1] [col];
    }
    for (int row = 1;
    row <= height; row++) {
        for (int col = 1;
        col < triangle [row].length - 1; col++) {
            System.out.print (triangle [row] [col] + "\t");
        }
        System.out.println ();
    }
}
