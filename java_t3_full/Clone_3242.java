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





public static void main (String [] args) throws Exception {
        String pass = "admin";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Insert the admin pass: ");
        String test = reader.readLine();
        loginCheck(pass, test, reader);
    }

    private static void loginCheck(String pass, String test, BufferedReader reader) throws Exception {
        if (pass.equals(test)) {
            System.out.print("Access granted");
        } else {
            for (int i = 1; i < 3; i ++) {
                System.out.print("You have " + i + " try(es): ");
                test = reader.readLine();
                if (pass.equals (test)) {
                    System.out.print("Access granted");
                    break;
                } else if (i == 2) {
                    System.out.print("Access denied");
                }
            }
        }
}


