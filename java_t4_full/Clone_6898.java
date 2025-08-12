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



public static void main (String[] args) {
    String[] symbols = {"A", "B", "C", "D"};
    for (int i = 1; i < 16; i++) {
        for (int j = 0; j < symbols.length; j++) {
            if ((i & (int) Math.pow(2, j)) > 0) System.out.print(symbols[j]);
        }
        System.out.println();
    }
}


