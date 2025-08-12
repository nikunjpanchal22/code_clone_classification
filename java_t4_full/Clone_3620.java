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
    Integer hours = null;
    while (hours == null) {
        try {
            hours = console.nextInt();
            System.out.println("**hours input accepted**");
        } catch (Exception e) {
            console.nextLine();
            System.out.println("Invalid input, please re-enter the hours again:");
        }
    }
    return hours;
}


