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
        FileInputStream fis = new FileInputStream(filename);
        Scanner scanner = new Scanner(fis);
        String result = scanner.nextLine();
        scanner.close();
        return result;
    } catch (IOException e) {
    }
    return null;
}


