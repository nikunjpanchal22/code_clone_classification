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
    // Declare a hashmap 
    HashMap<String, Integer> hm = new HashMap<String, Integer>();
    // Add elements to the hashmap
    for (String each : list) {
        if (hm.containsKey(each))
            hm.put(each, hm.get(each) + 1);
        else
            hm.put(each, 1);
    }

    // Sort the elements of the list
    Collections.sort(list);

    // Iterate through the list and create a new arraylist for the each element
    List <ArrayList <String>> out = new ArrayList <ArrayList <String>> ();
    for (String each : list) {
        ArrayList <String> temp = new ArrayList<String>();
        for (int j = 0; j < hm.get(each); j++) {
            temp.add(each);
        }
        //add the arraylist to the new arraylist
        out.add (temp);
    }
    System.out.println(out);
}


