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





public static void main(String[] args) throws IOException {
    String pass = "admin";
    BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter admin password :");
    String userPass = reader.readLine();
    if(userPass.equals(pass)){
        System.out.println("Access granted");
    } else{
        int attempts = 1;
        while(attempts<3 && !userPass.equals(pass)){
            System.out.println("You have "+(3-attempts)+" attempts left");
            userPass = reader.readLine();
            attempts++;
            if(userPass.equals(pass)){
                System.out.println("Access granted");
            }
        }
        if(!userPass.equals(pass)){
            System.out.println("Access denied");
        }
    }
}


