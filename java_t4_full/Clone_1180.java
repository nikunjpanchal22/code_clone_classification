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
	  System.out.print("Enter string: ");
	  String str = inp.nextLine();
	  HashMap<Character,Integer> map=new HashMap<Character,Integer>();
	  for(int i=0;i<str.length();i++){
	      char ch=str.charAt(i);
	      if(map.containsKey(ch)){
		  int count=map.get(ch);
		  count++;
		  map.put(ch,count);
	      }
	      else{
		  map.put(ch,1);
	      }
	  }  
	  for ( Map.Entry<Character,Integer> entry : map.entrySet()) {
	       System.out.println("Frequency of " + entry.getKey().toString()+"  is:   " + entry.getValue());
	  }
}


