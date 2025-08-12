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
    do {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Here");
            hours = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(", please re-enter the hours again:");
            continue;
        }
        System.out.println("**hours input accepted**");
        break;
    } while (true);
    return hours;
}


