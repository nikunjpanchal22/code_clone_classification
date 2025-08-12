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
            int counter = 0;
            while (counter != 2){
                if (counter == 0){
                    performFunction(1, 7, 2);
                }
                else if (counter == 1){
                    performFunction(5, 1, -2);
                }
                counter++;
            }
        }

        public static void performFunction(int start, int end, int increment){
            for (int row = start; row <= end; row += increment){
                printPattern(row, 7);
            }
        }

        public static void printPattern(int row, int total){
            for (int i = total; i >= row; i -= 2){
                System.out.print("*");
            }
            for (int i = 1; i <= row; i++){
                System.out.print(" ");
            }
            System.out.print("\n");
}


