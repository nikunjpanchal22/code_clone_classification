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
            int maximumRow = 7;
            for(int i = 0; i < 2; i++){
                int row = i == 0 ? 1 : 5;
                int increment = i == 0 ? 2 : -2;
                while (row >= 1 && row <= maximumRow) {
                    printPattern(row, maximumRow);
                    row += increment;
                }
            }
        }

        static void printPattern(int row, int total){
            for(int i = total; i >= row; i -= 2)
                System.out.print("*");
            for(int i = 1; i <= row; i++)
                System.out.print(" ");
            System.out.print("\n");
}


