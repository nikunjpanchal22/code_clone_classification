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
	List<Character> list1 = s1.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
	Collections.sort(list1);
	List<Character> list2 = s2.toLowerCase().chars().mapToObj(c -> (char) c).collect(Collectors.toList());
	Collections.sort(list2);
	return list1.equals(list2);
}


