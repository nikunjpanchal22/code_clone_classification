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
    int hours = -1;
    do {
        System.out.println("Please enter the number of hours:");
        if (console.hasNextInt()) {
            hours = console.nextInt();
            if (hours >= 0) {
                System.out.println("**hours input accepted**");
                break;
            }
        }
        console.nextLine(); 
    } while (true);
    return hours;
}


