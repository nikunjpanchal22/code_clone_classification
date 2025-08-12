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
    String password="admin";
    PasswordAuthentication pa=new PasswordAuthentication("admin",password.toCharArray());
    Console cnsl=null;
    boolean success=false;
    for(int i=0;i<3;i++){
        cnsl = System.console();
        char[] pwd = cnsl.readPassword("Enter password: ");
        PasswordAuthentication curr=new PasswordAuthentication("admin",pwd);
        if(pa.equals(curr)){
            success=true;
            break;
        }
    }
    if(success){
        System.out.println("Access granted");
    }else{
        System.out.println("Access denied");
    }
}


