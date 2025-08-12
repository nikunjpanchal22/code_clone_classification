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
        patternPrint(1,2,"*"," ");
        patternPrint(5,-2,"*"," ");
    }
    public static void patternPrint(int start, int step, String mainCh, String secCh){
        for(int row = start, space = 7; (row <= 7 && row >= 1); row += step, space -= 2){
            for(int i = space; i >= row; i -= 2) System.out.print(mainCh);
            for(int i = 1; i <= row; i++) System.out.print(secCh);
            System.out.print("\n");
        }
}


