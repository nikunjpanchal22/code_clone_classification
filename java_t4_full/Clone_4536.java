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







public static void main(String[] args) {
            int n = 15;
            int[][] pascal = new int[n+1][]; 
            fillPascalArray(pascal, n);
            printPascalArray(pascal, n);
        }

        public static void fillPascalArray(int[][] pascal, int n){
            pascal[1] = new int[1 + 2];
            pascal[1][1] = 1;
            for(int i = 2;i <= n; i++){
                pascal[i] = new int[i + 2];
                for(int j = 1;j < pascal[i].length - 1; j++){
                    pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
            }
        }
        public static void printPascalArray(int[][] pascal, int n){
            for(int i = 1; i <= n; i++){
                for(int j = 1;j < pascal[i].length - 1; j++ ) {
                    System.out.print(pascal[i][j] + " ");
                }
                System.out.println();
            }
}


