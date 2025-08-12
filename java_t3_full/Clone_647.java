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
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            hours = Integer.parseInt(line);
            hoursNotOk = false;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(", please re-enter the hours again:");
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println(", please re-enter the hours again:");
        } finally {
            if (hoursNotOk) {
                System.out.println(", please re-enter the hours again:");
            } else {
                System.out.println("**hours input accepted**");
            }
        }
    } while (hoursNotOk);
    return hours;
}


