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
    sopl("\n\tEchoing inputs: ");
    for (int i = 0; i < len; i++) {
        sopl("\n\t" + args[i]);
    }
    sopl("\n\tReversing the order: ");
    while (len > 0) {
        sopl("\n\t" + args[len-1]);
        len--;
    }
    sopl("");
}


