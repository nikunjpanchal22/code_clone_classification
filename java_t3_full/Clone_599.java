public static void main (String [] args) {
    int [] array = {1, 2, 3, 3, 2, 2, 4, 4, 5, 4};
    Map < Integer, Integer > counts = new HashMap < > ();
    for (Integer i : array) {
        if (counts.get (i) == null) {
            counts.put (i, 1);
        } else {
            counts.put (i, counts.get (i) + 1);
        }
    }
    List < Integer > cs = new ArrayList < Integer > (counts.values ());
    Collections.sort (cs);
    int minVal = cs.get (0);
    List < Integer > minElements = new ArrayList < > ();
    for (Entry < Integer, Integer > entry : counts.entrySet ()) {
        if (entry.getValue () == minVal) {
            minElements.add (entry.getKey ());
        }
    }
    for (Integer i : minElements) {
        System.out.println ("Element: " + i + " Number of occurences: " + minVal);
    }
}


  public static void main (String [] args) {
    int [] array = {1, 2, 3, 3, 2, 2, 4, 4, 5, 4};
    Map < Integer, Integer > counts = new HashMap < > ();
    for (int i = 0; i < array.length; i++) {
        int key = array[i];
        if (counts.containsKey (i)) {
            counts.put(key, counts.get(key) + 1);
        }
        else {
            counts.put (key, 1);
        }
    }
    int minVal = Integer.MAX_VALUE;
    for (Integer key : counts.keySet()) {
        minVal = Math.min(minVal, counts.get(key));
    }
    List < Integer > minElements = new ArrayList < > ();
    for (Entry < Integer, Integer > entry : counts.entrySet ()) {
        if (entry.getValue () == minVal) {
            minElements.add (entry.getKey ());
        }
    }
    for (Integer i : minElements) {
        System.out.println ("Element: " + i + " Number of occurences: " + minVal);
    }
}


