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
    Map <String, Integer> result = new TreeMap<String, Integer>(); 
    for (String s : "House, House, House, Dog, Dog, Dog, Dog".split(", ")) {
        if (result.containsKey(s)) 
            result.put(s, result.get(s) + 1);
        else
            result.put(s, 1);
    } 
    String uniqueString = String.join(", ", result.keySet()); 
    List<Integer> value = new ArrayList<Integer>(result.values()); 
    System.out.println("Output = " + uniqueString); 
    System.out.println("Values = " + value); 
} 


