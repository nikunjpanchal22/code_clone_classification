public static boolean isAnagram (String s1, String s2) {
    if (s1.length () != s2.length ()) {
        return false;
    }
    s1 = s1.toLowerCase ();
    s2 = s2.toLowerCase ();
    char [] c1 = s1.toCharArray ();
    char [] c2 = s2.toCharArray ();
    Arrays.sort (c1);
    Arrays.sort (c2);
    String sc1 = new String (c1);
    String sc2 = new String (c2);
    return sc1.equals (sc2);
}




public static boolean isAnagram(String s1, String s2) {
	if(s1.length() != s2.length()){
		return false;
	}
	int sum1 = 0, sum2 = 0;
	for(char c : s1.toLowerCase().toCharArray()){
		sum1 += c;
	}
	for(char c : s2.toLowerCase().toCharArray()){
		sum2 += c;
	}
	return sum1 == sum2;
}


