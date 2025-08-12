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
        IntStream.range(1, 16)
                .forEach(i -> {
                    printBitFlag(i, 1, 'A');
                    printBitFlag(i, 2, 'B');
                    printBitFlag(i, 4, 'C');
                    printBitFlag(i, 8, 'D');
                    System.out.println ();
                });
    }
    public static void printBitFlag(int n, int flag, char c) {
        if ((n & flag) != 0) System.out.print (c);
}


