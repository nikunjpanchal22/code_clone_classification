public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int cases = sc.nextInt ();
    String [] str = new String [cases];
    for (int i = 0;
    i < cases; i ++) {
        str [i] = sc.next ();
    }
}



 

public static void main(String[] args) throws FileNotFoundException {
	Scanner sc = new Scanner(new File("input.txt"));
	int cases = sc.nextInt ();
	List<String> strList = new ArrayList<>();
	for (int i = 0; i < cases; i ++) {
	    strList.add(sc.next());
	}
}


