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
    InputStreamReader fin = new InputStreamReader (new FileInputStream("line.srt"));
    BufferedReader reader = new BufferedReader(fin);
    StringBuilder builder = new StringBuilder();
    String line;
    
    while((line = reader.readLine()) != null){
        if(!line.trim().equals("")){
            builder.append(line).append("\n");
        }
    }
    reader.close();
    
    PrintWriter out = new PrintWriter ("newline.srt");
    out.println(builder.toString());
    out.close();
}


