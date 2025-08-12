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


 public static void main(String[] args){
    for (int i = 1; i < 16; i++){
        String output = "";
        if (i % 2 == 1) output+="A";
        if (i % 4 == 2 || i % 4 == 3) output+="B";
        if (i % 8 == 4 || i % 8 == 5) output+="C";
        if (i % 16 == 8 || i % 16 == 9 || i % 16 == 12 || i % 16 == 13) output+="D";
        System.out.println(output);
    }
}


