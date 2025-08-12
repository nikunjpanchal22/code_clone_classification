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




public static void main (String[] args) {
        printPattern(1, 7, 2, 7, 2, "*", 1, " ", "\n", true);
        printPattern(5, 1, -2, 7, 2, "*", 1, " ", "\n", false);
    }
    public static void printPattern(int startRow, int endRow, int rowIncrement, int startSpace, int spaceDecrement, String spaceSymbol, int startI, String iSymbol, String newRow, boolean isAscendant) {
        for (int row = startRow; isAscendant ? row <= endRow : row >= endRow; row += rowIncrement) {
            for (int space = startSpace; space >= row; space -= spaceDecrement) System.out.print(spaceSymbol);
            for (int i = startI; i <= row; i++) System.out.print(iSymbol);
            System.out.print(newRow);
        }
}


