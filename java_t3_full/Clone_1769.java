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
	SortedSet<Double> set = new TreeSet<>();
	for (int i = 0;
	i < trys; i ++) {
	    set.add(processTry(scanner));
	    System.out.println (set.first());
	    set.remove(set.first());
	}
	scanner.close ();
}


