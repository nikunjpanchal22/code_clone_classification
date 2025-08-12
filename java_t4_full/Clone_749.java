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
    // Create a set
    Set<String> s = new HashSet<String>();
    // Put the elements of list into the Set
    list.forEach(element -> s.add(element));
    // Create a map
    Map<String, Integer> map = new HashMap<>();
    // Iterate through the set and create a new arraylist and add the Map
    //for storing frequency of each element
    for (String str : s) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (str.equals(list.get(i)))
                count++;
        }
       map.put(str, count);
    }
    // Sort the list 
    Collections.sort(list);

    // Iterate through the map and create a new arraylist for the each element
    List < ArrayList <String> > out = new ArrayList < ArrayList <String> > ();
    for (String each : map.keySet()) {
        System.out.println(each);
        List <String> temp = new ArrayList<String>();
        for (int j = 0; j < map.get(each); j++) {
            temp.add(each);
        }
         //add the arraylist to the new arraylist
        out.add(temp);
    }
    System.out.println(out);
}


