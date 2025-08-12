public static void main (String [] args) {
    String pass = "admin";
    Scanner input = new Scanner (System.in);
    System.out.print ("Insert the admin pass: ");
    String test = input.nextLine ();
    if (pass.equals (test)) {
        System.out.print ("Access granted");
    } else {
        for (int i = 1;
        i < 3; i ++) {
            System.out.print ("You have " + i + " try(es): ");
            test = input.nextLine ();
            if (pass.equals (test)) {
                System.out.print ("Access granted");
                break;
            } else if (i == 2) {
                System.out.print ("Access denied");
            }
        }
    }
}


 public static void main (String [] args) {
    String pass = "admin";
    Scanner input = new Scanner (System.in);
    System.out.print ("Insert the admin pass: ");
    String test = input.nextLine ();
    boolean access = false;
    if (pass.equals (test)) {
        System.out.println ("Access granted");
    } else {
        for (int i = 1; i < 4; i++) {
            System.out.println ("You have " + i + " try(es): ");
            if (pass.equals (test)) {
                System.out.println ("Access granted");
                access = true;
                break;
            }
            else {
                test = input.nextLine ();
            }
        }
        if (!access) {
            System.out.println ("Access denied");
        }
    }
}


