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
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            hours = Integer.parseInt(br.readLine());
            hoursNotOk = false;
        } catch (IOException ioe) {
            System.out.println(", please re-enter the hours again:");
            ioe.printStackTrace();
        } 
    } while (hoursNotOk);
    System.out.println("**hours input accepted**");
    return hours;
}


