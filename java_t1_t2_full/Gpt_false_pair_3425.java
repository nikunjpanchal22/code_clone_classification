public static void main (String [] args) {
    HashMap < Character, Integer > hm = new HashMap < Character, Integer > ();
    System.out.println ("Enter an String:");
    Scanner sc = new Scanner (System.in);
    String s1 = sc.nextLine ();
    for (int i = 0;
    i < s1.length (); i ++) {
        if (! hm.containsKey (s1.charAt (i))) {
            hm.put (s1.charAt (i), (Integer) 1);
        } else {
            hm.put (s1.charAt (i), hm.get (s1.charAt (i)) + 1);
        }
    }
    System.out.println ("The Charecters are:" + hm);
}


public static void main (String [] args) {
	HashMap < Character, Integer > chars = new HashMap < Character, Integer > ();
	System.out.println ("Enter an String:");
	Scanner scan = new Scanner (System.in);
	String str = scan.nextLine ();
	for (int i = 0;
	i < str.length (); i ++) {
		if (! chars.containsKey (str.charAt (i))) {
			chars.put (str.charAt (i), (Integer) 1);
		} else {
			chars.put (str.charAt (i), chars.get (str.charAt (i)) + 1);
		}
	}
	System.out.println ("The Charecters are:" + chars);
}
