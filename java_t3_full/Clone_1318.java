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



 public static void main (String[] args) throws IOException {
    File lineFile = new File("line.srt");
    BufferedReader reader = new BufferedReader(new FileReader(lineFile));
    FileWriter fw = new FileWriter("newline.srt");
    BufferedWriter bw = new BufferedWriter(fw);

    String line = reader.readLine();
    while (line != null) {
        if(!line.trim().equals("")) {
            bw.write(line);
            bw.newLine();
        }
        line = reader.readLine();
    }
    reader.close();
    bw.close();
}


