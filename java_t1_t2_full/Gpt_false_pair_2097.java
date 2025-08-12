public String getInput (String filename) {
    BufferedReader infile = null;
    try {
        infile = new BufferedReader (new FileReader (filename));
        String response = infile.readLine ();
        return response;
    } catch (IOException e) {
    } finally {
        try {
            infile.close ();
        } catch (IOException e) {
        }
    }
    return null;
}


	public String getInput (String filename) {
    FileReader infile = null;
    try {
        infile = new FileReader (filename);
        BufferedReader br=new BufferedReader(infile);
        String response = br.readLine ();
        return response;
    } catch (IOException e) {
    } finally {
        try {
            br.close ();
        } catch (IOException e) {
        }
    }
    return null;
}
