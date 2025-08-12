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
    FileInputStream fin = new FileInputStream("line.srt");
    BufferedReader reader = new BufferedReader(new InputStreamReader(fin));
    FileWriter out = new FileWriter("newline.srt");
    String line;
    while ((line = reader.readLine()) != null) {
        if (!line.trim().isEmpty()) {
            out.write(line + "\n");
        }
    }
    out.close();
}


