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
        IntStream.rangeClosed(1, 7).filter(n -> n % 2 != 0).forEach(row -> printRow(row, "*", " "));
        IntStream.rangeClosed(1, 5).filter(n -> n % 2 != 0).sorted((a, b) -> b - a).forEach(row -> printRow(row, "*", " "));
    }
    public static void printRow(int row, String symbol, String separator) {
        IntStream.rangeClosed(row, 7).filter(n -> n % 2 != 0).forEach(space -> System.out.print(symbol));
        IntStream.rangeClosed(1, row).forEach(i -> System.out.print(separator));
        System.out.print("\n");
}


