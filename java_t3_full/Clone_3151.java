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
      Scanner input = new Scanner (System.in);
      int attempts = Integer.parseInt(input.nextLine().trim());
      for (int i = 0; i < attempts; i++) {
          double probability = processTry (input);
          System.out.println (probability);
      }
      input.close ();
}


