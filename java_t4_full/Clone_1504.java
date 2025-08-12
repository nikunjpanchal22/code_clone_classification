public static void main (String [] args) {
    String s = "harikrishna";
    String s2 = "";
    for (int i = 0;
    i < s.length (); i ++) {
        Boolean found = false;
        for (int j = 0;
        j < s2.length (); j ++) {
            if (s.charAt (i) == s2.charAt (j)) {
                found = true;
                break;
            }
        }
        if (found == false) {
            s2 = s2.concat (String.valueOf (s.charAt (i)));
        }
    }
    System.out.println (s2);
}


 public static void main (String[] args) { 
	String s = "harikrishna"; 
	String s2 = "";
	Set<Character> set = new HashSet<>();
	for (int i = 0; i < s.length(); i++) {
	   if (!(set.contains(s.charAt(i)))) {
	       set.add(s.charAt(i));
	       s2 = s2.concat(String.valueOf(s.charAt(i)));
	    }
	 }
	System.out.println(s2);
}


