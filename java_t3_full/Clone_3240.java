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





public static void main(String[] args) {
    String password = "admin";
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        System.out.print("Insert the admin pass: ");
        String enteredPassword = input.next();
        if (enteredPassword.equals(password)) {
            System.out.print("Access granted");
            break;
        } else if (i < 2) {
            System.out.println("You have " + (2 - i) + " try(es) left. ");
        } else {
            System.out.println("Access denied");
        }
    }
}


