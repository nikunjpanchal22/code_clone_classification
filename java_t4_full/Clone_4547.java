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
            final int n = 10;
            final int diff = 2;
            final int start = 1;
            int [][] pascal = new int [n + start][];
            initilizePascal(pascal, start, diff, n);
            printPascal(pascal, start, n);
        }

        public static void initilizePascal(int[][] pascal, int start, int diff, int n){
            pascal[0] = new int[start + diff];
            pascal[0][start] = start;
            for(int i = start; i <= n; i ++) {
                pascal[i] = new int [i + diff];
                for(int j = start; j < pascal[i].length - start; j ++) pascal[i][j] = pascal[i - start][j - start] + pascal[i - start][j];
            }
        }

        public static void printPascal(int[][] pascal, int start, int n){
            for(int i = start; i <= n; i ++) {
                for(int j = start; j < pascal[i].length - start; j ++) {
                    System.out.print (pascal[i][j] + " ");
                }
                System.out.println ();
            }
}


