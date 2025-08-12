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
        for(int row = 1; row <= 7; row += 2) {
            printRow(row, 7, 2, "*", 1, " ", "\n");
        }
        for(int row = 5; row >= 1; row -= 2) {
            printRow(row, 7, 2, "*", 1, " ", "\n");
        }
    }
    public static void printRow(int row, int startSpace, int spaceStep, String spaceSymbol, int iStep, String iSymbol, String rowSeparator) {
        for(int space = startSpace; space >= row; space -= spaceStep) {
            System.out.print(spaceSymbol);
        }
        for(int i = 1; i <= row; i += iStep) {
            System.out.print(iSymbol);
        }
        System.out.print(rowSeparator);
}


