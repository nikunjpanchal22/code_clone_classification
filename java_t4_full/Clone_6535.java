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
    String pass = "mySecretPass";
    int maxAttempts = 3;
    boolean isSuccess = false;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter password: ");
    String inputPass = in.nextLine();
    for(int i = 0; i < maxAttempts; i++){
        if(pass.equalsIgnoreCase(inputPass)){
            isSuccess = true;
            break;
        }
        System.out.print("Remaining attempt(s) " + (maxAttempts - i - 1) + ": ");
        inputPass = in.nextLine();
    }
    System.out.println(isSuccess ? "Login successful!" : "Login failed!");
}


