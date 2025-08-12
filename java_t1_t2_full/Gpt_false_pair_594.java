public static int getHours () {
    int hours = 0;
    boolean hoursNotOk = true;
    do {
        try {
            System.out.println ("Here");
            hours = console.nextInt ();
            hoursNotOk = false;
        } catch (Exception e) {
            e.printStackTrace ();
            console.nextLine ();
        } finally {
            if (hoursNotOk) {
                System.out.println (", please re-enter the hours again:");
            } else {
                System.out.println ("**hours input accepted**");
            }
        }
    } while (hoursNotOk);
    return hours;
}


 public static int getHours() {
    int hours = 0;
    boolean hoursNotOk = true;
    do {
        try {
            System.out.println("Here");
            hours = Integer.parseInt(JOptionPane.showInputDialog("Enter Hours: "));
            hoursNotOk = false;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Input Error - Please re-enter the hours again: ");
        } finally {
            if (hoursNotOk) {
                JOptionPane.showMessageDialog(null, ", please re-enter the hours again: ");
            } else {
                System.out.println("**hours input accepted**");
            }
        }
    } while (hoursNotOk);
    return hours;
}
