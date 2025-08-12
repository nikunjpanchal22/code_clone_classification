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
    sopl("\tEchoing inputs: \n");
    int times = len / 10;
    int remainder = len % 10;
    for (int i = 0; i < times; i++){
        for (int j = 0; j < 10; j++){
            sop(args[i * 10 + j] + " ");
        }
        sopl();
    }
    for (int i = 0; i < remainder; i++){
        sop(args[times*10 + i] + " ");
    }
    sopl("\n\tReversing the order: \n");
    times = len / 10;
    remainder = len % 10;
    for (int i = times; i > 0; i--){
        for (int j = 0; j < 10; j++){
            sop(args[(i-1) * 10 + j] + " ");
        }
        sopl();
    }
    for (int i = remainder-1; i >= 0; i--){
        sop(args[times*10 + i] + " ");
    }
    sopl();
}


