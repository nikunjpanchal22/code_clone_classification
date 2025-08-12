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
    FileInputStream infile = null;
    Scanner sc;
    try {
        infile = new FileInputStream(filename);
        sc = new Scanner(infile);
        String response = sc.nextLine();
        return response;
    } catch (IOException e) {
    } finally {
        try {
            sc.close();
        } catch (IOException e) {
        }
    }
    return null;
}
