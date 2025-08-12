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





public static void main (String [] args) {
    JFrame frame = new JFrame("Password");
    String pass = "admin";
    String test = JOptionPane.showInputDialog(frame,"Enter password: ");
    int tryCount = 0;
    while (tryCount < 2 && !pass.equals(test)) {
        test = JOptionPane.showInputDialog(frame,"Enter password: ");
        tryCount++;
    }
    if(pass.equals(test)) {
        JOptionPane.showMessageDialog(frame,"Access granted");
    } else {
        JOptionPane.showMessageDialog(frame,"Access denied");
    }
}


