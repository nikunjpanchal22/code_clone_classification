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
        runPattern(7);
    }

    public static void runPattern(int maxRow) {
        for (int row = 1; row <= maxRow; row += 2) {
            printPattern(row, maxRow);
        }
        for (int row = maxRow - 2; row >= 1; row -= 2) {
            printPattern(row, maxRow);
        }
    }

    public static void printPattern(int row, int maxRow){
        for (int star = maxRow; star >= row; star -= 2){
            System.out.print("*");
        }
        for (int space = 1; space <= row; space++){
            System.out.print(" ");
        }
        System.out.print("\n");
}


