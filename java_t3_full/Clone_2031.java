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

    while (maxTries > 0) {
        String password = input.nextLine();
        if (correctPassword.equals(password)) {
            success = true;
            break;
        }else {
            System.out.println("You still have " + maxTries + " try(es) left");
            maxTries--;
        }
    }
    if (success) {
        System.out.println("Access granted");
    } else {
        System.out.println("Access denied");
    }
}


