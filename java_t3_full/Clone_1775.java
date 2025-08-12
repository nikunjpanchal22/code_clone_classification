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
	Queue<Double> queue = new LinkedList<>();
	for (int i = 0;
	i < trys; i ++) {
	    queue.add(processTry(scanner));
	    System.out.println (queue.poll());
	}
	scanner.close ();
}


