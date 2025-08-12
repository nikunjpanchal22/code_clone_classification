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
            int size = 7;
            int increment = 2;
            drawPattern(size, increment);
            drawPattern(size - increment, -increment);
        }

        private static void drawPattern(int rows, int increment){
            for (int row = increment > 0 ? 1 : rows;
                increment > 0 ? row <= rows : row >= 1; 
                row += increment) {
                printPattern(row, rows);
            }
        }

        private static void printPattern(int row, int total){
            for (int i = total; i >= row; i -= 2) {
                System.out.print ("*");
            }
            for (int i = 1; i <= row; i ++) {
                System.out.print (" ");
            }
            System.out.print ("\n");
}


