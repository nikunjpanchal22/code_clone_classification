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
        if ((i & 1) > 0) output+="A";
        if ((i & 2) > 0 || ((i+1) & 2) > 0) output+="B";
        if ((i & 4) > 0 || ((i+3) & 4) > 0) output+="C";
        if ((i & 8) > 0 || ((i-7) & 8) > 0) output+="D";
        System.out.println(output);
    }
}


