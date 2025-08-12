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
        printPattern(new int[]{1,7,2}, new int[]{7,2}, "*", new int[]{1,1,0}, " ", "\n");
        printPattern(new int[]{5,1,-2}, new int[]{7,2}, "*", new int[]{1,1,0}, " ", "\n");
    }
    public static void printPattern(int[] rowParams, int[] spaceParams, String spaceSymbol, int[] iParams, String iSymbol, String rowSeparator) {
        for(int row = rowParams[0]; row <= rowParams[1]; row += rowParams[2]) {
            for(int space = spaceParams[0]; space >= row; space -= spaceParams[1]) {
                System.out.print(spaceSymbol);
            }
            for(int i = iParams[0]; i <= row; i += iParams[1]) {
                System.out.print(iSymbol);
            }
            System.out.print(rowSeparator);
        }
}


