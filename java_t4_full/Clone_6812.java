public static void main (String args []) throws InterruptedException, IOException {
    List < String > command = new ArrayList < String > ();
    command.add (args [0]);
    ProcessBuilder builder = new ProcessBuilder (command);
    Map < String, String > environ = builder.environment ();
    final Process process = builder.start ();
    InputStream is = process.getInputStream ();
    InputStreamReader isr = new InputStreamReader (is);
    BufferedReader br = new BufferedReader (isr);
    String line;
    while ((line = br.readLine ()) != null) {
        System.out.println (line);
    }
    System.out.println ("Program terminated!");
}





public static void main(String[] args) throws Exception {
    ProcessBuilder processBuilder = new ProcessBuilder(args[0]);
    final Process process = processBuilder.start();
    new Thread(() -> new BufferedReader(new InputStreamReader(process.getInputStream()))
            .lines().forEach(System.out::println)).start();
    process.waitFor();
    System.out.println("Program terminated!");
}


