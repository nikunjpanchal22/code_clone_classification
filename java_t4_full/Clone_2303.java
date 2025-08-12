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
    int[] x = new int[]{1, 2, 4, 8};
    for (int i = 1; i < 16; i++){
        String output = "";
        for (int j = 0; j < x.length; j++){
            if ((i & x[j]) > 0){
                if (j == 0) output+="A";
                else if (j == 1) output+="B";
                else if (j == 2) output+="C";
                else output+="D";
            }
        }
        System.out.println(output);
    }
}


