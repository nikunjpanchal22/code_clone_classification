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
        for (int i = 1; i < 16; ++ i) {
            printBit(i, 1, "A");
            printBit(i, 2, "B");
            printBit(i, 4, "C");
            printBit(i, 8, "D");
            System.out.println ();
        }
    }
    public static void printBit(int n, int bit, String symbol) {
        if ((n & bit) != 0) System.out.print(symbol);
}


