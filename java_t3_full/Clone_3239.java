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
    java.io.Console console = System.console();
    char[] passwordArray = console.readPassword("Insert the admin pass: ");
    String test = new String(passwordArray);
    if (pass.equals(test)) System.out.print("Access granted");
    else {
        for (int i = 1; i < 3; i ++) {
            System.out.print("You have " + i + " try(es): ");
            passwordArray = console.readPassword();
            test = new String(passwordArray);
            if (pass.equals(test)) {
                System.out.print("Access granted");
                break;
            } else if (i == 2) System.out.print("Access denied");
        }
    }
}


