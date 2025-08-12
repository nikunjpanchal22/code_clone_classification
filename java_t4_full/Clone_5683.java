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
        printPattern(1,7,2, "*", " ");
        printPattern(5,1,-2,"*"," ");
    }
    public static void printPattern(int start, int stop, int step, String expr1, String expr2) {
        for(int row = start; row != stop + step; row += step) {
            for(int space = 7; space>= row; space -= 2) System.out.print(expr1);
            for(int i = 1; i<= row; i++) System.out.print(expr2);
            System.out.print("\n");
        }
}


