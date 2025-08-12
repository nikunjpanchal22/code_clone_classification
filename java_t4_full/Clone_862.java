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



 //using loop unrolling
public static void main (String [] args) {
    int len = args.length;
    int j;
    int i;
    if (len <= 0) {
        System.out.println (" ERROR: Please input a value of 1-5");
        System.exit (0);
    }
    if(len >= 1) { 
        System.out.println ("*"); 
    }
    if(len >= 2) { 
        System.out.println ("**"); 
    }
    if(len >= 3) { 
        System.out.println ("***"); 
    }
    if(len >= 4) { 
        System.out.println ("****"); 
    }
    if(len >= 5) { 
        System.out.println ("*****"); 
    }
}


