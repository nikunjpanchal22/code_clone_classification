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
    // Create a List to store the elements of the list
    List<String> list2 = new ArrayList<String>();
    // Store the unique elements in list 2
    for(String element : list)
        if(!list2.contains(element))
            list2.add(element);

    // Sort the list 
    Collections.sort(list2);
    // Declare a list of ArrayLists
    List <ArrayList <String>> out = new ArrayList <ArrayList <String>>();
    // Iterate through the list and create a new arraylist for the each element
    for(String each : list2) {
        System.out.println(each);
        ArrayList <String> temp = new ArrayList <String>();
        for(int i = 0; i < list.size(); i++){
            if (each.equals(list.get(i)))
                temp.add(list.get(i));
        }
        // add the arraylist to the new arraylist
        out.add(temp);
    }
    System.out.println(out);
}


