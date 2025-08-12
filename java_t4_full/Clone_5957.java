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
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int trials = Integer.parseInt(bufferedReader.readLine().trim());
    for (int i = 0; i < trials; i++) {
        double probability = processTry(bufferedReader);
        System.out.println(probability);
    }
    bufferedReader.close();
}


