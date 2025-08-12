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
            final int numOfLines = 15;
            int [] [] pascalTriangle = new int [numOfLines + 1] [];

            fillPascalTriangle(pascalTriangle, numOfLines);
            printPascalTriangle(pascalTriangle, numOfLines);
        }

        public static void fillPascalTriangle(int[][] pascalTriangle, int numOfLines){
            for (int i = 1;i <= numOfLines; i ++) {
                pascalTriangle [i] = new int [i + 2];
                pascalTriangle [i] [1] = 1;
                for (int j = 2;j < pascalTriangle [i].length - 1; j++)
                    pascalTriangle [i] [j] = pascalTriangle [i - 1] [j - 1] + pascalTriangle [i - 1] [j];
            }
        }

        public static void printPascalTriangle(int[][] pascalTriangle, int numOfLines){
            for (int i = 1;i <= numOfLines; i ++) {
                for (int j = 1;j < pascalTriangle [i].length - 1; j ++)
                    System.out.print (pascalTriangle [i] [j] + " ");
                System.out.println ();
            }
}


