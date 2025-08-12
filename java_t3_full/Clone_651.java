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
    while (hoursNotOk) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Here");
            hours = Integer.parseInt(br.readLine());
            hoursNotOk = false;
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(", please re-enter the hours again:");
        }
    }
    System.out.println("**hours input accepted**");
    return hours;
}


