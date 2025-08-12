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
      Scanner scanObj = new Scanner(System.in);
      int reps = scanObj.nextInt();
      for(int i = 0; i < reps; i++) {
        double prob = processTry(scanObj);
        System.out.println(prob);
      }
      scanObj.close();                                                  
}

