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
    for (int i = 1; i < 16; ++i){
        if (i >= 1 && i <= 7) System.out.print("A");
        if ((i >= 2 && i <= 3) || (i >= 6 && i <= 7)) System.out.print("B");
        if ((i >= 4 && i <= 5) || (i == 8)) System.out.print("C");
        if (i == 9 || i == 10 || i == 12 || i == 13) System.out.print("D");
        System.out.println("");
    }
}


