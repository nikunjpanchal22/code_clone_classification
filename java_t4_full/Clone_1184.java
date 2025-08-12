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
	  Scanner inp = new Scanner(System.in); 
	  String str = inp.nextLine(); 
	  Map<Character, Integer> map = new HashMap<Character, Integer>(); 
	  for (int i = 0; i<str.length(); i++) { 
	      Character ch = str.charAt(i); 
	      if(map.get(ch) == null) { 
		  map.put(ch, 1); 
	      } 
	      else { 
		  map.put(ch, map.get(ch)+1); 
	      }  
	  } 
	  for(Character c : map.keySet()){     
	      System.out.println("Frequency of " + c + "  is:   " + map.get(c));
	  } 
}


