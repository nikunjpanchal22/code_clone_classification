public static void main (String [] args) {
    Scanner scanner = new Scanner (System.in);
    String line = scanner.nextLine ();
    int trys = Integer.parseInt (line.trim ());
    for (int i = 0;
    i < trys; i ++) {
        double probability = processTry (scanner);
        System.out.println (probability);
    }
    scanner.close ();
}





public static void main (String [] args) throws IOException {
    BufferedReader inputData = new BufferedReader(new InputStreamReader(System.in));
    int roundNr = Integer.parseInt(inputData.readLine().trim());
    for (int i = 0; i < roundNr; i++) {
        double probability = processTry(inputData);
        System.out.println(probability);
    }
    inputData.close();
}


