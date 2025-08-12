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
    for (int i = 0; i < len; i++) {
        sop(args[i]);
        for (int j = i + 1; j < len; j++) {
            sop(" " + args[j]);
        }
        sopl();
    }
    sopl("\n\tReversing the order: \n");
    for (int i = len-1; i >= 0; i--) {
        sop(args[i]);
        for (int j = i - 1; j >= 0; j--) {
            sop(" " + args[j]);
        }
        sopl();
    }
    sopl("");
}


