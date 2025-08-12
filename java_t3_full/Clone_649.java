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
    boolean hoursNotOk = true;
    int hours = 0;
    do {
        try {
            System.out.println("Here");
            Scanner input = new Scanner(System.in);
            hours = (int) input.nextDouble();
            if (hours >= 0 && hours <= 24) {
                System.out.println("**hours input accepted**");
                hoursNotOk = false;
            } else {
                System.out.println(", please re-enter the hours again:");
            }
        } catch (Exception e) {
            System.out.println(", please re-enter the hours again:");
        }
    } while (hoursNotOk);
    return hours;
}


