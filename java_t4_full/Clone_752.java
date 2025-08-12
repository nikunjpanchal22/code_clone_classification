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


 public static void main (String args []) throws java.io.IOException {
    // Declare a Map 
    Map<String, Integer> mapOut = new HashMap<>();
   // Iterate through the list and create a new arraylist for the each element
    for (String each : list) {
        if (mapOut.containsKey(each))
            mapOut.put(each, mapOut.get(each) + 1);
        else
            mapOut.put(each, 1);
    }
    // Sort the list 
    Collections.sort(list);
    // Declare a list of ArrayLists
    List < ArrayList <String> > out = new ArrayList < ArrayList <String> > (); 
    // Iterate through the map and create a new arraylist for the each element
    for (String each : mapOut.keySet()) {
        System.out.println(each);
        List <String> temp = new ArrayList<String>();
        for (int j = 0; j < mapOut.get(each); j++) {
            temp.add(each);
        }
        //add the arraylist to the new arraylist
        out.add(temp);
    }
    System.out.println(out);
}


