public static void main (String [] args) {
    File fileName = new File ("hello.txt");
    try {
        String startToken = "Hello";
        String endToken = "Bye";
        boolean output = false;
        Scanner scan = new Scanner (fileName);
        while (scan.hasNextLine ()) {
            String line = scan.nextLine ();
            if (! output && line.indexOf (startToken) > - 1) {
                output = true;
                line = line.substring (line.indexOf (startToken) + startToken.length ());
            } else if (output && line.indexOf (endToken) > - 1) {
                output = false;
                System.out.println (line.substring (0, line.indexOf (endToken)));
            }
            if (output) {
                System.out.println (line);
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace ();
    }
}




public static void main (String [] args) {
    String startToken = "Hello";
    String endToken = "Bye";
    boolean output = false;
    try (BufferedReader br = new BufferedReader(new FileReader("hello.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            if (!output && line.contains(startToken)) {
                output = true;
                line = line.substring(line.indexOf(startToken) + startToken.length());
            }
            if (output && line.contains(endToken)) {
                output = false;
                System.out.println(line.substring(0, line.indexOf(endToken)));
            }
            if (output) {
                System.out.println(line);
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}


