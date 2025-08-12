public static void main (String [] args) throws FileNotFoundException {
    String s = "this is line one\n" + "this is line two\n" + "This is line three";
    Pattern p = Pattern.compile ("this");
    Scanner scanner = new Scanner (s);
    while (scanner.hasNextLine ()) {
        String line = scanner.nextLine ();
        Matcher m = p.matcher (line);
        if (m.find ()) {
            System.out.println (line);
        }
    }
}


public static void main (String [] args) throws FileNotFoundException {
    String str = "this is line one\n" + "this is line two\n" + "This is line three";
    Pattern regex = Pattern.compile ("this");
    Scanner scn = new Scanner (str);
    while (scn.hasNextLine ()) {
        String lne = scn.nextLine ();
        Matcher mtc = regex.matcher (lne);
        if (mtc.find ()) {
            System.out.println (lne);
        }
    }
}
