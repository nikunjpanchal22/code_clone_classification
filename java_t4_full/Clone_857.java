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
    int i = 0;
    while (i < len) {
        sop(args[i] + " ");
        i++;
        if (i % 10 == 0) {
            sopl();
        }
    }
    sopl();
    sopl("\n\tReversing the order: \n");
    for (int j = len-1; j >= 0; j--) {
        sop(args[j] + " ");
        if ((len-j)%10 == 0){
            sopl();
        }
    }
    if (len % 10 != 0){
        sopl();
    }
    sopl("");
}


