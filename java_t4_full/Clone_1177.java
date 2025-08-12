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


 public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  String inputString = scanner.nextLine();
	  char[] character = inputString.toCharArray(); 
	  int count[] = new int[256]; 
	  for (int i = 0; i < 256; i++) {
	      count[i] = 0;
	  }
	  // hash table
	  int len = inputString.length(); 
	  for (int i = 0; i < len; i++) {
	      count[inputString.charAt(i)]++;
	  }

	  char ch[] = new char[inputString.length()];
	  for (int i = 0; i < len; i++) {
	      ch[i] = inputString.charAt(i);
	      int find = 0;
	      for (int j = 0; j <= i; j++) {
		  // count occurence
		  if (inputString.charAt(i) == ch[j])
		      find++;
	      }
	      if (find == 1)
		  System.out.println("Frequency of " + inputString.charAt(i) +
		    " is:  " + count[inputString.charAt(i)]);
	  }
}


