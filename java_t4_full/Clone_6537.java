public static void main (String [] args) {
    String pass = "admin";
    int maxTry = 3;
    boolean success = false;
    Scanner input = new Scanner (System.in);
    System.out.print ("Insert the admin pass: ");
    String test = input.nextLine ();
    while (maxTry > 0) {
        maxTry --;
        if (! pass.equals (test)) {
            System.out.print ("You have " + maxTry + " try(es): ");
            test = input.nextLine ();
        } else {
            success = true;
            break;
        }
    }
    if (success) {
        System.out.println ("Access granted");
    } else {
        System.out.println ("Access denied");
    }
}





public static void main(String[] args) {
    Console console = System.console();
    int attempts = 3;
    do {
        char passwordArray[] = console.readPassword("Enter the admin password: ");
        String password = new String(passwordArray);
        if ("admin".equals(password)) {
            System.out.println("Access granted");
            return;
        } else {
            attempts--;
        }
    } while(attempts > 0);
    System.out.println("Access denied");
}


