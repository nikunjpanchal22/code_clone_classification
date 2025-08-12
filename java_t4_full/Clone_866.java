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


 //using while loop
public static void main (String [] args) {
    int len = args.length;
    int j;
    if (len <= 0) {
        System.out.println (" ERROR: Please input a value of 1-5");
        System.exit (0);
    }
     
    int i = 0;
    while (i <= len) {
        j = 0;
        while (j <= i) {
            System.out.print("*");
            j++;
        }
        System.out.println("");
        i++;
    }
}


