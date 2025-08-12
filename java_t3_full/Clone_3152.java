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
      Scanner scannerObj = new Scanner(System.in);
      int total = Integer.parseInt(scannerObj.nextLine ().trim());
      for (int count = 0; count < total; count++) {
          double probability = processTry(scannerObj);
          System.out.println(probability);
      }
      scannerObj.close();
}

