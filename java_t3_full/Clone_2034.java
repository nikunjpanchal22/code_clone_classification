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
    int attempts = 0;
    while (attempts < 3) {
        attempts++;
        if (attempts == 1) {
            System.out.print ("You have " + attempts + " try: ");
        } else {
            System.out.print ("You have " + attempts + " tries: ");
        }
        if (pass.equalsIgnoreCase(test)) {
            System.out.print("Access granted");
            break;
        } else if (attempts == 3) {
            System.out.print("Access denied");
        } else {
            test = input.nextLine();
        }
    }
}


