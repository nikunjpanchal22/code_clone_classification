public static void main (String [] args) {
    for (int row = 1;
    row <= 7; row += 2) {
        for (int space = 7;
        space >= row; space -= 2) {
            System.out.print ("*");
        }
        for (int i = 1;
        i <= row; i ++) {
            System.out.print (" ");
        }
        System.out.print ("\n");
    }
    for (int row = 5;
    row >= 1; row -= 2) {
        for (int space = 7;
        space >= row; space -= 2) {
            System.out.print ("*");
        }
        for (int i = 1;
        i <= row; i ++) {
            System.out.print (" ");
        }
        System.out.print ("\n");
    }
}





public static void main (String [] args) {
            int[][] matrix = new int[][]{
                                        {1,2,3,4,5,6,7},
                                        {5,4,3,2},
                                        {7,6,5,4,3,2,1}
                                        };
            for(int[] rowArr: matrix){
                for(int row : rowArr){
                    printPattern(row, matrix[0][matrix[0].length-1]);
                }
            }
        }

        private static void printPattern(int row, int total){
            for (int i = total; i >= row; i -= 2) {
                System.out.print ("*");
            }
            for (int i = 1; i <= row; i ++) {
                System.out.print (" ");
            }
            System.out.println();
}


