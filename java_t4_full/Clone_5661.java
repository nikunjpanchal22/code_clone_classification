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
        int[] array = {1, 3, 5, 7, 5, 3, 1};
        for(int row: array){
            printPattern(row, 7);
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


