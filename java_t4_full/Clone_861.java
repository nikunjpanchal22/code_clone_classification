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



 //using switch-case block
public static void main (String [] args) {
    int len = args.length;
    int j;
     
    if (len <= 0) {
        System.out.println (" ERROR: Please input a value of 1-5");
        System.exit (0);
    }
     
    switch(len) {
        case 1 : 
            System.out.println("*");
            break;
        case 2 :
            System.out.println("* \n**");
            break;
        case 3 :
            System.out.println("* \n** \n***");
            break;
        case 4 :
            System.out.println("* \n** \n*** \n****");
            break;
        case 5 :
            System.out.println("* \n** \n*** \n**** \n*****");
            break;
    }
}


