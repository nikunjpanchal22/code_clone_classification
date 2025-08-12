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


public static int getTime () {
    int time = 0;
    boolean timeNotOk = true;
    do {
        try {
            System.out.println ("Here");
            time = console.nextInt ();
            timeNotOk = false;
        } catch (Exception e) {
            e.printStackTrace ();
            console.nextLine ();
        } finally {
            if (timeNotOk) {
                System.out.println (", please re-enter the time again:");
            } else {
                System.out.println ("**time input accepted**");
            }
        }
    } while (timeNotOk);
    return time;
}
