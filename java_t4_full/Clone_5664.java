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




public static void main(String[] args) {
        int[] sequence = new int[]{1, 3, 5, 7, 5, 3, 1};
        for (int i = 0; i < sequence.length; i++) {
            starSpacePrint(sequence[i]);
        }
    }

    private static void starSpacePrint(int row) {
        int starCount = (8 - row) / 2;
        for (int i = 0; i < starCount; i++) {
            System.out.print("*");
        }
        for (int j = 0; j < row; j++) {
            System.out.print(" ");
        }
        System.out.print("\n");
}


