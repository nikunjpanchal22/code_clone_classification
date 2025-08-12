public static void main (String...args) {
    List < List < Integer > > array = new ArrayList < List < Integer > > ();
    Scanner input = new Scanner (System.in);
    out.println ("Enter n:");
    int n = input.nextInt ();
    out.println ("Enter m:");
    int m = input.nextInt ();
    out.println ("Enter the values:");
    for (int i = 0;
    i < n; i ++) {
        List < Integer > list = new ArrayList < Integer > ();
        array.add (list);
        for (int j = 0;
        j < m; j ++) {
            list.add (input.nextInt ());
        }
    }
    out.println ("Result:");
    out.println (array);
}


 public static void main(String[] args) 
{ 
	    List<List<Integer>> array = new ArrayList<List<Integer>>(); 
	  
	    int n, m; 
	    Scanner scanner = new Scanner(System.in); 
	  
	    System.out.print("Enter the value of n: "); 
	    n = scanner.nextInt(); 
	  
	    System.out.print("Enter the value of m: "); 
	    m = scanner.nextInt(); 
	  
	    int i, j; 
	    System.out.print("Enter the int values: "); 
	    for (i = 0; i < n; i++) { 
	  
		List<Integer> list = new ArrayList<Integer>(); 
		for (j = 0; j < m; j++) 
		    list.add(scanner.nextInt()); 
		array.add(list); 
	    } 
	  
	    System.out.println("Result"); 
	    System.out.println(array); 
}


