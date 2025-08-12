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
    FileInputStream fin = new FileInputStream ("line.srt");
    List<String> lines = new ArrayList<>();
    BufferedReader reader = new BufferedReader(new InputStreamReader(fin));
    String line;
    while ((line = reader.readLine()) != null) {
      if (!line.trim().equals("")) {
        lines.add(line);
      }
    }
    reader.close();
    
    FileOutputStream fout = new FileOutputStream ("newline.srt");
    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(fout));
    for (String str : lines) {
      writer.write(str);
      writer.newLine();
    }
    writer.close();
}


