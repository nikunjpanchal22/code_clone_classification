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
        for (int row = 1; row <= 7; row += 2) {
            patternConstructor(row, 7);
        }
        for (int row = 5; row >= 1; row -= 2) {
            patternConstructor(row, 7);
        }
    }

    public static void patternConstructor(int row, int totalRows) {
        for (int stars = totalRows; stars >= row; stars -= 2){
            System.out.print("*");
        }
        for (int spaces = 1; spaces <= row; spaces++){
            System.out.print(" ");
        }
        System.out.println();
}


