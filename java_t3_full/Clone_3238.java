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


 


public class Main {
    public static void main(String[] args) {
        String pass = "admin";
        Scanner sc = new Scanner(System.in);
        int attempts = 0;
        while (attempts < 3) {
            System.out.println("Enter Password");
            String enteredPass = sc.nextLine();
            if (!enteredPass.equals(pass)) {
                attempts++;
                System.out.println("You have " + (3 - attempts) + " tries left");
            } else {
                System.out.println("Access granted");
                break;
            }
        }
        if (attempts == 3) {
            System.out.println("Access denied");
        }
    }
}


