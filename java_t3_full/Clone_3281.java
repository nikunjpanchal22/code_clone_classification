public static void main (String [] args) throws IOException {
    File dir = new File (".");
    String source = dir.getCanonicalPath () + File.separator + "Code.txt";
    String dest = dir.getCanonicalPath () + File.separator + "Dest.txt";
    File fin = new File (source);
    FileInputStream fis = new FileInputStream (fin);
    BufferedReader in = new BufferedReader (new InputStreamReader (fis));
    FileWriter fstream = new FileWriter (dest, true);
    BufferedWriter out = new BufferedWriter (fstream);
    String aLine = null;
    while ((aLine = in.readLine ()) != null) {
        out.write (aLine);
        out.newLine ();
    }
    in.close ();
    out.close ();
}



public static void main(String[] args)throws IOException {
    File file1 = new File("Code.txt");
    File file2 = new File("Dest.txt");
    FileReader fr = new FileReader(file1);
    BufferedReader br = new BufferedReader(fr);
    FileWriter fw = new FileWriter(file2, true);
    PrintWriter pw = new PrintWriter(fw);
    String line;
    while((line = br.readLine()) != null){
        pw.println(line);
    }
    pw.close();
    br.close();
}


