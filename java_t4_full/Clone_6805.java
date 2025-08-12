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
    List<String> launchedCommand = Collections.singletonList(args[0]);
    ProcessBuilder builder = new ProcessBuilder(launchedCommand);
    Map<String, String> envVars = builder.environment();
    final Process process = builder.start();
    String line;
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
        while ((line = reader.readLine()) != null) System.out.println(line);
    }
    System.out.println("Program terminated!");
}


