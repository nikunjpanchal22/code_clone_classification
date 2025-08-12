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
    static String pass = "admin";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Insert the admin pass: ");
        if (checkPass(scanner.nextLine())) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }

    private static boolean checkPass(String input) {
        for (int i = 0; i < 2; i++) {
            if (pass.equals(input)) {
                return true;
            } else {
                System.out.println("You have " + (2 - i) + " try(es) left: ");
                input = scanner.nextLine();
            }
        }
        return pass.equals(input);
    }
}


