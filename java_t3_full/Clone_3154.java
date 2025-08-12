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
      Scanner sc = new Scanner (System.in);
      int iterations = sc.nextInt();
      for (int i = 0; i < iterations; i++) {
          double probability = processTry (sc);
          System.out.println (probability);
      }
      sc.close ();
}

