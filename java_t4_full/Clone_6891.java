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
        int endLimit = 16;
        for (int i = 1; i < endLimit; ++ i) {
            printCharacterIfBitSet(i, 1, 'A');
            printCharacterIfBitSet(i, 2, 'B');
            printCharacterIfBitSet(i, 4, 'C');
            printCharacterIfBitSet(i, 8, 'D');
            System.out.println ();
        }
    }
    private static void printCharacterIfBitSet(int number, int bit, char c) {
        if ((number & bit) > 0) System.out.print (c);
}


