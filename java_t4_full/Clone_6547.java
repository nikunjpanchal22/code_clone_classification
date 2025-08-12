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
    String pass = "admin";
    for (int i = 0; i < 3; i++) {
        System.out.println("Enter password:");
        Scanner input = new Scanner(System.in);
        String test = input.nextLine();
        if (pass.equals(test)) {
            System.out.println("Access granted");
            return;
        } 
    }
    System.out.println("Access denied");
}


