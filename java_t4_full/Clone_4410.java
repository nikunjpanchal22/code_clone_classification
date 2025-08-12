public static void main (String [] args) {
    int len = args.length;
    if (len <= 0) {
        System.out.println (" ERROR: Please input a value of 1-5");
        System.exit (0);
    }
    int j;
    for (int i = 0;
    i <= len; i ++) {
        for (j = 0; j <= i; j ++) System.out.print ("*");
        System.out.println ("");
    }
}




public static void main (String[] args) {
    if (args.length <= 0) {
        System.out.println ("ERROR: Please input a value of 1-5");
        System.exit (1);
    }
    for (int i = 1; i <= args.length; i ++) {
        for (int j = 1; j <= i; j ++) System.out.print ("*");
        System.out.println ();
    }
} 


