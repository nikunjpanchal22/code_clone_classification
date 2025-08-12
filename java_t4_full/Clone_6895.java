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
            printCharacterIfBitSet(i, 1, 'A');
            printCharacterIfBitSet(i, 2, 'B');
            printCharacterIfBitSet(i, 4, 'C');
            printCharacterIfBitSet(i, 8, 'D');
            System.out.println ();
        }
    }
    public static void printCharacterIfBitSet(int n, int bit, char character){
        if ((n & bit) != 0) System.out.print(character);
}


