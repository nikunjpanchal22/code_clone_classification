public static boolean contains (String a, String b) {
    boolean status = true;
    Map < String, Integer > mapA = new HashMap < > ();
    Map < String, Integer > mapB = new HashMap < > ();
    for (char i : a.toCharArray ()) {
        Integer val = mapA.get ("" + i);
        if (val != null) {
            mapA.put ("" + i, val + 1);
        } else {
            mapA.put ("" + i, 1);
        }
    }
    for (char i : b.toCharArray ()) {
        Integer val = mapB.get ("" + i);
        if (val != null) {
            mapB.put ("" + i, val + 1);
        } else {
            mapB.put ("" + i, 1);
        }
    }
    for (Map.Entry < String, Integer > entry : mapA.entrySet ()) {
        if (mapB.get (entry.getKey ()) == null || entry.getValue () > mapB.get (entry.getKey ())) {
            status = false;
        }
    }
    return status;
}


 public static boolean contains (String a, String b) {
    List<Character> listA = new ArrayList<Character>();
    List<Character> listB = new ArrayList<Character>();

	for (char c : a.toCharArray()) {
	  if (!listA.contains(c))
	    listA.add(c);
	}

	for (char c : b.toCharArray()) {
	  if (!listB.contains(c))
	    listB.add(c);
	}

	boolean status = true;
	for (Character c : listA) {
	  if (!listB.contains(c))
	    status = false;
	}
	return status;
}


