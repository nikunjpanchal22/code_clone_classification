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
    Map<String, Integer> counter = new TreeMap<String, Integer>(); 
    for(String word : "House, House, House, Dog, Dog, Dog, Dog".split(", ")) {
        if(counter.containsKey(word))
            counter.put(word, counter.get(word) + 1);
        else
            counter.put(word, 1);
    } 
    String outputString = String.join(", ", counter.keySet()); 
    List<Integer> count = new ArrayList<Integer>(counter.values()); 
    System.out.println("Output = " + outputString); 
    System.out.println("Values = " + count); 
} 


