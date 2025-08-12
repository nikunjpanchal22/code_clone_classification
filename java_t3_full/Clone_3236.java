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





public static void main (String [] args){
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String pass = "admin";
    System.out.println ("Enter password: ");
    try {
        String test = br.readLine();
        if (!test.equals(pass)) {
        for (int i = 0; i < 2; i++) {
            System.out.println ("Enter password again: ");
            test = br.readLine();
            if (test.equals(pass)) {
            System.out.println ("Access granted");
            break;
            } else {
            System.out.println ("Access denied");
            }
        }
        } else {
        System.out.println ("Access granted");
        }
    } catch(IOException e){
        e.printStackTrace();
    }
}


