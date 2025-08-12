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
    // Declare a map 
    Map<String, Integer> map = new HashMap<String, Integer>();
    // Put the elements of list into the map
    list.forEach(element -> {
        if (map.containsKey(element))
            map.put(element, map.get(element) + 1);
        else
            map.put(element, 1);
    });
   // Sort the list 
   Collections.sort(list);
   //Declare a list of ArrayLists
   List < ArrayList <String>> newList = new ArrayList <ArrayList<String>>();
   // Iterate through the map and create a new arraylist for the each element
    for (String each: map.keySet()){
        List<String> subList = new ArrayList<String>();
        for (int j = 0; j < map.get(each); j++){
            subList.add(each);
        }
         //add the arraylist to the new arraylist
        newList.add(subList);
    }
    System.out.println(newList);
    
}


