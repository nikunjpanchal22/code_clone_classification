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


 public static void main (String [] args) throws FileNotFoundException, IOException {
    Scanner fin = new Scanner(new FileInputStream("line.srt"));
    FileWriter fw = new FileWriter("newline.srt");
    BufferedWriter bw = new BufferedWriter(fw);
    
    while (fin.hasNextLine()) {
        String line = fin.nextLine();
        if (!line.trim().equals("")) {
            bw.write(line);
            bw.newLine();
        }
    }
    fin.close();
    bw.close();
}


