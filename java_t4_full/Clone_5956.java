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
    BufferedReader readData = new BufferedReader(new InputStreamReader(System.in));
    int trialNum = Integer.parseInt(readData.readLine().trim());
    for (int i = 0; i < trialNum; i++) {
        double probability = processTry(readData);
        System.out.println(probability);
    }
    readData.close();
}


