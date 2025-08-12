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
    try {
        return new RandomAccessFile(filename, "r").readLine();
    } catch (IOException e) {
    }
    return null;
}


