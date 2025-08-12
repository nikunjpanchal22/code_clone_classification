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
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      int tries = Integer.parseInt(reader.readLine().trim());
      for (int i = 0; i < tries; i++) {
          double probability = processTry(reader);
          System.out.println(probability);
      }
      reader.close();
}

