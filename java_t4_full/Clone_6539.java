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
    int tryCount = 3;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while(tryCount-- > 0){
        System.out.println("Enter password: ");
        String input;
        try {
        input = br.readLine();
        if(pass.equals(input)){
            System.out.println("Access granted.");
            return;
        }
        } catch(IOException e) {
        e.printStackTrace();
        }
    }
    System.out.println("Access denied.");
}


