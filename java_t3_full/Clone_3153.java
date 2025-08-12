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





public static void main (String [] args) {
    Scanner inputScan = new Scanner(System.in);
    int trials = inputScan.nextInt();
    for(int index = 0; index < trials; index++){
        double probability = processTry(inputScan);
        System.out.println(probability);
    }
    inputScan.close();
}

