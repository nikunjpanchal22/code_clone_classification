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


  public static void main(String[] args) {
    char[] letters = {'A', 'B', 'C', 'D'};
    for (int i = 0; i < 16; ++i) {
        for (int j = 0; j < 4; ++j) {
            if ((i & 1 << j) > 0) {
                System.out.print(letters[j]);
            }
        }
        System.out.println("");
    }
}


