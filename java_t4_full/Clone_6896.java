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
            if (isBitSet(i, 1)) System.out.print ('A');
            if (isBitSet(i, 2)) System.out.print ('B');
            if (isBitSet(i, 4)) System.out.print ('C');
            if (isBitSet(i, 8)) System.out.print ('D');
            System.out.println ("");
        }
    }
    public static boolean isBitSet(int n, int bit) {
        return (n & bit) > 0;
}

