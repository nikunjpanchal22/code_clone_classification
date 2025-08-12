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
    char[] pass = {'a', 'd', 'm', 'i', 'n'};
    Scanner input = new Scanner(System.in);
    System.out.print ("Enter password: ");
    char[] test = input.nextLine().toCharArray();
    boolean access = true;
    if (pass.length != test.length) {
        access = false;
    } else {
        for (int i = 0; i < pass.length; i++) {
            if (pass[i] != test[i]) {
                access = false;
                break;
            }
        }
    }
    System.out.println (access ? "Access granted" : "Access denied");
}


