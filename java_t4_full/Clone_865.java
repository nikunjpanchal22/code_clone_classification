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


  //using if-else-if
public static void main (String [] args) {
    int len = args.length;
     
    if (len <= 0) {
        System.out.println (" ERROR: Please input a value of 1-5");
        System.exit (0);
    }
    else if (len == 1) {
        System.out.println ("*");
    }
    else if (len == 2) {
        System.out.println ("* \n**");
    }
    else if (len == 3) {
        System.out.println ("* \n** \n***");
    }
    else if (len == 4) {
        System.out.println ("* \n** \n*** \n****");
    }
    else if (len == 5) {
        System.out.println ("* \n** \n*** \n**** \n*****");
    }
} 


