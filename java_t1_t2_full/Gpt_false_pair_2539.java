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
    String correctPassword = "admin"; 
    int maxTries = 3; 
    boolean success = false; 
    Scanner input = new Scanner(System.in); 
 
    System.out.print("Insert the admin password: "); 
    for (int tries = 0; tries < maxTries; tries++) { 
        String password = input.nextLine(); 
        if (!correctPassword.equals(password)) { 
            System.out.println("You still have " + (maxTries - (tries+1)) + " try(es) left"); 
        } else { 
            success = true; 
            break; 
        } 
    } 
    if (success) { 
        System.out.println("Access granted"); 
    } else { 
        System.out.println("Access denied"); 
    } 
}
