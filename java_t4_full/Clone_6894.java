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
            printIfBitSet(i, 1, 'A');
            printIfBitSet(i, 2, 'B');
            printIfBitSet(i, 4, 'C');
            printIfBitSet(i, 8, 'D');
            System.out.println ();
        }
    }
    public static void printIfBitSet(int n, int bit, char c) {
        if ((n & bit) != 0) System.out.print(c);
}


