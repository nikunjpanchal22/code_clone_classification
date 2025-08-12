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
    int pow = 0;
    int b_val = 0;
    for (int i = 1; i < 16; ++i) {
        pow = (int) Math.pow(2, b_val++);
        if ((i & pow) > 0) System.out.print("A");
        if ((i & pow * 2) > 0) System.out.print("B");
        if ((i & pow * 4) > 0) System.out.print("C");
        if ((i & pow * 8) > 0) System.out.print("D");
        System.out.println("");
    }
}


