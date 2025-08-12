public static void main (String [] args) throws FileNotFoundException, IOException {
    FileInputStream fin = new FileInputStream ("line.srt");
    BufferedReader reader = new BufferedReader (new InputStreamReader (fin));
    PrintWriter out = new PrintWriter ("newline.srt");
    int i = 0;
    String line = reader.readLine ();
    while (line != null) {
        if (! line.trim ().equals ("")) {
            out.println (line);
        }
        line = reader.readLine ();
    }
    out.close ();
}





public static void main(String[] args) throws FileNotFoundException, IOException {
    Path inputFile = Paths.get("line.srt");
    Path outputFile = Paths.get("newline.srt");
    Stream<String> lines = Files.lines(inputFile);
    PrintWriter output = new PrintWriter(new FileWriter(outputFile.toFile()));
    lines.filter(line -> !line.trim().isEmpty()).forEach(output::println);
    output.close();
}


