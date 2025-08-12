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
    ArrayList<String> commandList = new ArrayList<>();
    commandList.add(args[0]);
    ProcessBuilder builder = new ProcessBuilder(commandList);
    Map<String, String> envVariables = builder.environment();
    final Process process = builder.start();
    BufferedReader outputReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
    String outputLine;
    while ((outputLine = outputReader.readLine()) != null) System.out.println(outputLine);
    System.out.println("Program terminated!");
}


