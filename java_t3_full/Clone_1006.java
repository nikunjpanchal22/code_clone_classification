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


 //using for loop with break statement
public static void main (String [] args) {
    int len = args.length;
    int j;
     
    if (len <= 0) {
        System.out.println (" ERROR: Please input a value of 1-5");
        System.exit (0);
    }
    for (int i = 0; ; i++) {
        if (i > len) 
            break;
        for (j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}


