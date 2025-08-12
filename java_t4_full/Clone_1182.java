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
	  String inputStr = scanner.nextLine();
	  int freq = 0;
	  HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();

	  for (int i = 0; i < inputStr.length(); i++) {
	      for (int j = 0; j < inputStr.length(); j++) {
		  if (inputStr.charAt(i) == inputStr.charAt(j))
		      freq++;
	      }
	      hMap.put(inputStr.charAt(i), freq);
	      freq = 0;
	  }
	  for (Map.Entry<Character, Integer> entry : hMap.entrySet()) {
	      char key = entry.getKey();
	      int value = entry.getValue();
	      System.out.println("Frequency of " + Character.toString(key) + "  is:   " + value);
	  }
}


