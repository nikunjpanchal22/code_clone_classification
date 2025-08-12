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





public static void main(String[] args){
    String pwd = "admin";
    for(int i = 3; i > 0; i--){
        System.out.print("Enter the pass: ");
        String enteredPwd = new Scanner(System.in).nextLine();
        if(!pwd.equals(enteredPwd)){
            System.out.println("Failed attempt, remaining - " + (i-1));
        } else {
            System.out.println("Access allowed"); 
            return;
        } 
    }
    System.out.println("Access prohibited"); 
}


