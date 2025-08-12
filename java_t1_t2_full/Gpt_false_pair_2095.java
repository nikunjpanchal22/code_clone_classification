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
    Reader r = null;
    BufferedReader br;
    try {
        r = new FileReader(filename);
        br = new BufferedReader(r);
        String response = br.readLine ();
        return response;
    } catch (IOException e) {
    } finally {
        try {
            r.close ();
        } catch (IOException e) {
        }
    }
    return null;
}
