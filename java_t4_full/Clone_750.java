public static void main (String args []) throws java.io.IOException {
    List < String > list = new ArrayList < String > ();
    list.add ("A");
    list.add ("B");
    list.add ("A");
    list.add ("B");
    list.add ("C");
    list.add ("D");
    Collections.sort (list);
    List < ArrayList < String > > arrays = new ArrayList < ArrayList < String > > ();
    int k = 0;
    for (int i = 0;
    i < list.size ();) {
        int count = Collections.frequency (list, list.get (i));
        arrays.add (new ArrayList < String > ());
        for (int j = 0;
        j < count; j ++) {
            arrays.get (k).add (list.get (i));
        }
        i += count;
        k ++;
    }
    for (ArrayList < String > arr : arrays) {
        for (String s : arr) {
            System.out.print (s + " ");
        }
        System.out.println ();
    }
}


 public static void main (String args[]) throws java.io.IOException {
	// Use a HashSet to store the elements of the list
	Set<String> set = new HashSet<String>();
	for (String each : list) {
	    set.add(each);
	}
	// Create a HashMap for storing the frequency of each element
	Map<String, Integer> map = new HashMap<String, Integer>();
	for (String each : set) {
	    int count = 0;
	    for (String current : list) {
		if (each.equals(current))
		    count++;
	    }
	    map.put(each, count);
	}
	// Sort the list 
	Collections.sort(list);
	//Declare a list of ArrayLists
	List < ArrayList <String>> newList = new ArrayList <ArrayList<String>>();
	// Iterate through the map and create a new arraylist for the each element
	for (String each : map.keySet()) {
	    ArrayList <String> temp = new ArrayList<String>();
	    for (int j = 0; j < map.get(each); j++) {
	    temp.add(each);
	    }
	    //add the arraylist to the new arraylist
	    newList.add(temp);
	}
	System.out.println(newList);
}


