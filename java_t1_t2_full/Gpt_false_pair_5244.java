public static void main (String [] args) {
    Map < String, Integer > unique = new LinkedHashMap < String, Integer > ();
    for (String string : "House, House, House, Dog, Dog, Dog, Dog".split (", ")) {
        if (unique.get (string) == null) unique.put (string, 1);
        else unique.put (string, unique.get (string) + 1);
    }
    String uniqueString = join (unique.keySet (), ", ");
    List < Integer > value = new ArrayList < Integer > (unique.values ());
    System.out.println ("Output = " + uniqueString);
    System.out.println ("Values = " + value);
}


public static void main (String [] args) {
    Map < String, Integer > items = new LinkedHashMap < String, Integer > ();
    for (String item : "House, House, House, Dog, Dog, Dog, Dog".split (", ")) {
        if (items.get (item) == null) 
            items.put (item, 1);
        else 
            items.put (item, items.get (item) + 1);
    }
    String uniqueString = join (items.keySet (), ", ");
    List < Integer > occurrences = new ArrayList < Integer > (items.values ()); 
    System.out.println ("Output = " + uniqueString);
    System.out.println ("Values = " + occurrences);
}
