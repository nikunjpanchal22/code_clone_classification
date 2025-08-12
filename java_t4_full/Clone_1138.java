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
    BufferedReader in = new BufferedReader(
        new InputStreamReader(
            new FileInputStream("line.srt")));
    BufferedWriter out = new BufferedWriter(
        new OutputStreamWriter(
            new FileOutputStream("newline.srt")));
    String line;
    while((line = in.readLine()) != null) {
        if(!line.trim().equals(""))
            out.write(line + "\n");
    }
    in.close();
    out.close();
}


