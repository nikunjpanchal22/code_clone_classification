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
	  Scanner sc = new Scanner(System.in);
	  System.out.print("Enter a string: ");
	  String str = sc.nextLine();
	  char[] charsInString = str.toCharArray();
	  Map<Character, Integer> freqMap = new HashMap<Character, Integer>();

	  for (char c : charsInString) {
	      if (freqMap.containsKey(c)) {
		  freqMap.put(c, freqMap.get(c) + 1);
	      } else {
		  freqMap.put(c, 1);
	      }
	  }
	  for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
	      char key = entry.getKey();
	      Integer value = entry.getValue();
	      System.out.println("Frequency of " + Character.toString(key) + "  is:   " + value);
	  }
}


