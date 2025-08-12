public static void main (String [] args) {
    for (int i = 1;
    i < 16; ++ i) {
        if ((i & 1) > 0) System.out.print ("A");
        if ((i & 2) > 0) System.out.print ("B");
        if ((i & 4) > 0) System.out.print ("C");
        if ((i & 8) > 0) System.out.print ("D");
        System.out.println ("");
    }
}



public static void main (String [] args) {
        java.util.stream.IntStream.range(1, 16).forEach(i -> {
            printBits(i);
            System.out.println();
        });
    }
    public static void printBits(int n) {
        printBit(n, 1, 'A');
        printBit(n, 2, 'B');
        printBit(n, 4, 'C');
        printBit(n, 8, 'D');
    }
    public static void printBit(int n, int bit, char c) {
        if ((n & bit) > 0) System.out.print(c);
}


