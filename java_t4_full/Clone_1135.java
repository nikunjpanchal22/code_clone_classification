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


 public static void main (String [] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        new FileInputStream("line.srt")
    ));
    BufferedWriter writer = new BufferedWriter(new FileWriter("newline.srt"));
    
    String line;
    while ((line = reader.readLine()) != null) {
        if(!line.trim().equals("")) {
            writer.write(line);
            writer.newLine();
        }
    }
    reader.close();
    writer.close();
}


