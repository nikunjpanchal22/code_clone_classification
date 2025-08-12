public static void main (String [] args) {
    int len = args.length;
    if (len == 0) {
        sopl ("\n\tUsage: java echo <args:String[]>");
        System.exit (0);
    }
    sop ("\n\t");
    for (int i = 0;
    i < len; i ++) {
        sop (args [i] + " ");
    }
    sop ("\n\t");
    while (len > 0) sop (args [args.length - len --] + " ");
    sopl ("");
}


 public static void main (String [] args) {
    int len = args.length;
    if (len == 0) {
        sopl ("\n\tUsage: java echo <args:String[]>");
        System.exit (0);
    }
    sopl("\n\tEchoing inputs: \n");
    for (int i = 0; i < len; i++){
        System.out.printf("\t%-15s", args[i]);
        if ((i+1)%3 == 0){
            System.out.println();
        }
    }
    if (len % 3 != 0){
        System.out.println();
    }
    sopl("\n\tReversing the order: \n");
    for (int j = len-1; j >= 0; j--) {
        System.out.printf("\t%-15s", args[j]);
        if ((len-j)%3 == 0){
            System.out.println();
        }
    }
    if (len % 3 != 0) {
        System.out.println();
    }
    sopl("");
}


