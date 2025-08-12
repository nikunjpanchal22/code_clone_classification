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


public static int getData() {
    int data = 0;
    boolean dataNotOk = true;
    do {
        try {
            System.out.println ("Here");
            data = console.nextInt ();
            dataNotOk = false;
        } catch (Exception e) {
            e.printStackTrace ();
            console.nextLine ();
        } finally {
            if (dataNotOk) {
                System.out.println (", please re-enter the data again:");
            } else {
                System.out.println ("**data input accepted**");
            }
        }
    } while (dataNotOk);
    return data;
}
