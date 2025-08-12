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
    Scanner scanner = null;
    try {
        scanner = new Scanner(new File(filename));
        String response = scanner.nextLine();
        return response;
    } catch (IOException e) {
    } finally {
        scanner.close();
    }
    return null;
}
