public static void main (String [] arguments) {
    Scanner inputChar = new Scanner (System.in);
    int i;
    while (true) {
        System.out.println ("Type in any integer:");
        if (! inputChar.hasNextInt ()) {
            System.out.println ("Not a number");
            inputChar.next ();
        } else {
            i = inputChar.nextInt ();
            if (i != 0) {
                if (i % 2 == 0) System.out.println (i + " is even");
                else {
                    System.out.println (i + " is odd");
                }
            } else {
                System.out.println ("Zeros are not allowed, bye!");
                break;
            }
        }
    }
}


public static void main (String [] arguments) {
    Scanner inputChar = new Scanner (System.in);
    int i;
    while (true) {
        System.out.println ("Type in any integer:");
        if (! inputChar.hasNextInt ()) {
            System.out.println ("Not a number");
            inputChar.next ();
        } else {
            i = inputChar.nextInt ();
            if (i != 0) {
                if (i % 2 == 0) System.out.println (i + " is a multiple of two");
                else {
                    System.out.println (i + " is an odd number");
                }
            } else {
                System.out.println ("Zeros are not allowed, bye!");
                break;
            }
        }
    }
}
