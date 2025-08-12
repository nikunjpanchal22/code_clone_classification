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





public static void main(String[] args) throws IOException, InterruptedException {
    ProcessBuilder processBuilder = new ProcessBuilder(args[0]);
    Map<String, String> environment = processBuilder.environment();
    final Process proc = processBuilder.start();
    BufferedReader print = new BufferedReader(new InputStreamReader(proc.getInputStream()));
    String data;
    while ((data = print.readLine()) != null) System.out.println(data);
    System.out.println("Program terminated!");
}


