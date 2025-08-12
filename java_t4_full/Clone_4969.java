public static void main (String [] args) {
    Scanner sc = new Scanner (System.in);
    int cases = sc.nextInt ();
    String [] str = new String [cases];
    for (int i = 0;
    i < cases; i ++) {
        str [i] = sc.next ();
    }
}



 

public static void main(String[] args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int cases = Integer.parseInt(br.readLine());
	List<String> str = new ArrayList<>();
	for (int i = 0; i < cases; i++) {
		str.add(br.readLine());
	}
}


