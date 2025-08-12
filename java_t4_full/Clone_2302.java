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
    for (int i = 1; i < 16; ++i) {
        int n = i;
        boolean[] odd = new boolean[4];
        odd[0] = (n%2 == 1);
        odd[1] = (n/2)%2 == 1;
        odd[2] = (n/4)%2 == 1;
        odd[3] = (n/8)%2 == 1;
        if (odd[0]) System.out.print("A");
        if (odd[1]) System.out.print("B");
        if (odd[2]) System.out.print("C");
        if (odd[3]) System.out.print("D");
        System.out.println("");
    }
}


