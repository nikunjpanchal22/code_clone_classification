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






public static void main(String [] args) {
            final int n = 15;
            final int arrSize = n + 1;
            int [][] pascal = new int [arrSize] [];
            pascalGeneration(pascal, arrSize, n);
            pascalDisplay(pascal, arrSize, n);
        }

        public static void pascalGeneration(int [][] pascal, int arrSize, int n) {
            pascal[1] = new int[1 + 2];
            pascal[1][1] = 1;
            for(int row = 2; row <= n; row++) {
                pascal[row] = new int[row + 2];
                for(int col = 1; col < pascal[row].length - 1; col++)
                    pascal[row][col] = pascal[row - 1][col - 1] + pascal[row - 1][col];
            }
        }

        public static void pascalDisplay(int [][] pascal, int arrSize, int n) {
            for(int row = 1; row <= n; row++) {
                for(int col = 1; col < pascal[row].length - 1; col++) {
                    System.out.printf("%d ", pascal[row][col]);
                }
                System.out.println();
            }
}


