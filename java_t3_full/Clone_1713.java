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
    FileInputStream fis = null;
    InputStreamReader isr= null;
    BufferedReader buf = null;
    try {
        fis = new FileInputStream(filename);
        isr = new InputStreamReader(fis);
        buf = new BufferedReader(isr);
        String response = buf.readLine ();
        return response;
    } catch (IOException e) {
    } finally {
        try {
            buf.close ();
        } catch (IOException e) {
        }
    }
    return null;
}


