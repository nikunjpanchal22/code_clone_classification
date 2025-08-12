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
	Scanner scanner = new Scanner (System.in);
	String line = scanner.nextLine ();
	int trys = Integer.parseInt (line.trim());
	Double[] arr = new Double[trys];
	for (int i = 0;
	i < trys; i ++) {
	    arr[i] = (double) processTry(scanner);
	    System.out.println (arr[i]);
	}
	scanner.close ();
}


