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
    int attemptCount = 0;
    String passwordInput;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    do {
        System.out.println("Enter password: ");
        passwordInput = reader.readLine();
        attemptCount++;
        if (passwordInput.equals("admin")) {
            System.out.println("Access granted");
            System.exit(0);
        }
    } while (attemptCount < 3);
    System.out.println("Access denied");
}


