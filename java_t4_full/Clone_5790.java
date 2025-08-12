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
    File file = new File(filename);
    try (Scanner scanner = new Scanner(file)) {
        if (scanner.hasNextLine()) {
            return scanner.nextLine();
        }
    } catch(IOException e) {
    }
    return null;
}


