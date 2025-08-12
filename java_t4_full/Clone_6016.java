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
    Map < String, Integer > unique = new TreeMap < String, Integer > ();
    for (String string : "House, House, House, Dog, Dog, Dog, Dog".split (", ")) {
        unique.put(string, unique.getOrDefault(string, 0) + 1);
    }
    System.out.println ("Output = " + String.join(", ", unique.keySet()));
    System.out.println ("Values = " + new ArrayList<>(unique.values()));
}


