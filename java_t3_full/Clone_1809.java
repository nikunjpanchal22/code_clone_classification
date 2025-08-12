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


 public static void main (String [] args) 
{ 
    Map<String, Integer> store = new LinkedHashMap<String, Integer>(); 
    for(String s : "House, House, House, Dog, Dog, Dog, Dog".split(", ")) {
        if(store.containsKey(s))
            store.put(s, store.get(s) + 1);
        else
            store.put(s, 1);
    }
    String outputString = String.join(", ", store.keySet());
    List<Integer> summations = new ArrayList<Integer>(store.values());
    System.out.println("Output = " + outputString);
    System.out.println("Values = " + summations);
}


