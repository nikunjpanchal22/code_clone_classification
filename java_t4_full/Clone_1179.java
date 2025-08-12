public static void main (String args []) {
    inp = new Scanner (System.in);
    String str = inp.nextLine ();
    List < Character > arrlist = new ArrayList < Character > ();
    for (int i = 0;
    i < str.length (); i ++) {
        arrlist.add (str.charAt (i));
    }
    for (int i = 0;
    i < str.length (); i ++) {
        int freq = Collections.frequency (arrlist, str.charAt (i));
        System.out.println ("Frequency of " + str.charAt (i) + "  is:   " + freq);
    }
}


 public static void main (String args[]) { 
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("Enter string: ");
	  String str = scanner.nextLine(); 
	  int length = str.length();
	  int count;
	  Set<Character> strAlphabets = new HashSet<>();
	  for (int i=0; i<length;i++){
	      char c = str.charAt(i);
	      if (!strAlphabets.contains(c)) {
		  strAlphabets.add(c);
		  count = 1;
		  for (int j = i + 1; j<length;j++) {
		      if (c == str.charAt(j)){
		          count++;
		      }
		  }
	      System.out.println("Frequency of " + c + "  is:   " + count);
	      }
	  }
}


