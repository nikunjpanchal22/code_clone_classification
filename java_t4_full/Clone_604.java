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
    while (hours == 0) {
        try {
            System.out.println ("Here");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            hours = Integer.parseInt(br.readLine());

        } catch (Exception e){
            System.out.println(", please re-enter the hours again:");
            e.printStackTrace();
        }
    }
    System.out.println ("**hours input accepted**");
    return hours;
}


