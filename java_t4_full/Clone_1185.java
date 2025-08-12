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


 public static void main (String args[]){
	  Scanner scanner = new Scanner(System.in);
	  String inputString = scanner.next();
	  char[] character = inputString.toCharArray();
	  Map<Character, Integer> charCountMap = new HashMap<>();
	  for(char c : character){
	    if(charCountMap.containsKey(c)){
		charCountMap.put(c, charCountMap.get(c)+1);
	    } else {
		charCountMap.put(c, 1);
	    }
	  }
	  //Getting the Character and its count frequency
	  for (Map.Entry entry : charCountMap.entrySet()){
	      System.out.println("Character = "+ entry.getKey() + 
		      "    Frequency =" + entry.getValue());
	  }
}


