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





public static void main(String args[]) throws IOException, InterruptedException {
    List<String> commandList = Collections.singletonList(args[0]);
    ProcessBuilder builder = new ProcessBuilder(commandList);
    final Process process = builder.start();
    try (InputStreamReader isr = new InputStreamReader(process.getInputStream());
         BufferedReader br = new BufferedReader(isr)) {
        br.lines().forEach(System.out::println);
    }
    System.out.println("Program terminated!");
}


