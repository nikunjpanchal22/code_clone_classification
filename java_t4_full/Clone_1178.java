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


 public static void main (String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a string: ");
	  String str = sc.nextLine();

	  // build hash table
	  HashMap<Character, Integer> charsMap = new HashMap<Character, Integer>();
	  for (int i = 0; i < str.length(); i++) {
	      char ch = str.charAt(i);
	      Integer n = charsMap.get(ch);
	      if (n == null) {
		  charsMap.put(ch, 1);
	      } else {
		  charsMap.put(ch, n + 1);
	      }
	  }

	  for (Map.Entry<Character, Integer> entry: charsMap.entrySet()) {
	      char currentChar = entry.getKey();
	      int count = entry.getValue();
	      System.out.println("Frequency of "+currentChar+"  is:   "+count);
	  }
}


