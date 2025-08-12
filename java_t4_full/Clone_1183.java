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
	  Scanner scanner = new Scanner(System.in);
	  System.out.print("Enter a string: ");

	  // Reads a line of text
	  String str = scanner.nextLine();
	  Map<Character, Integer> charactersMap = new HashMap<Character, Integer>();

	  for (int i = 0; i < str.length(); i++) {
	      char currentChar = str.charAt(i);
	      if (charactersMap.containsKey(currentChar)) {
		  charactersMap.put(currentChar, charactersMap.get(currentChar) + 1);
	      } else {
		  charactersMap.put(currentChar, 1);
	      }
	  }
	  
	  Set<Character> charactersInString = charactersMap.keySet();
	  for (Character ch : charactersInString) {
	      if (charactersMap.get(ch) == 1)
		  System.out.println("Frequency of " + ch + "  is:   " + charactersMap.get(ch));
	  }
}


