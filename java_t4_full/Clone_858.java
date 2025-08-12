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
    sopl ("\n\tEchoing inputs: \n");
    for (int i = 0; i < len; i ++) {
        if (i == len - 1) {
            sopl (args [i]);
        } else {
            sop (args [i] + " ");
        }
    }
    sopl ("\n\tReversing the order: \n");
    int j = 0;
    for (int i = len - 1; i >= 0; i --) {
        if (j == len - 1) {
            sopl (args [i]);
        } else {
            sop (args [i] + " ");
        }
        j++;
    }
    sopl ("");
}


