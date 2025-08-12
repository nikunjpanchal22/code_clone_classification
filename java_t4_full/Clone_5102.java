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
    FileReader fr = new FileReader("line.srt");
    BufferedReader reader = new BufferedReader(fr);
    PrintWriter out = new PrintWriter(new FileWriter("newline.srt"));
    reader.lines().filter(line -> !line.trim().isEmpty()).forEach(out::println);
    out.close();
}


